package com.example.start_project.controller;

import com.example.start_project.entities.produit;
import com.example.start_project.services.produitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class produitController {
    @Autowired
    produitService produitService;

    @GetMapping("/")
    @ResponseBody
    public List<produit> getAllProduit(){
        List<produit> list = produitService.getAllProduit();
        return list;
    }

    @PostMapping("/ajouter")
    @ResponseBody
    public produit addProduit(@RequestBody produit p){
        return produitService.saveProduit(p);
    }

    @DeleteMapping("delete/{id}")
    @ResponseBody
    public void deleteProduit(@PathVariable("id") int idProduit){
        produitService.deleteProduitById(idProduit);
    }

}
