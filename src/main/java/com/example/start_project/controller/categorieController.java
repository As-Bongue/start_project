package com.example.start_project.controller;

import com.example.start_project.entities.categorie;
import com.example.start_project.services.categorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class categorieController {


    categorieService categorieService;

    @GetMapping("/categories.show")
    @ResponseBody
    public List<categorie> getAllCategorie(){
        List<categorie> list = categorieService.getAllCategorie();
        return list;
    }

    @PostMapping ("/categorie.add")
    @ResponseBody
    public categorie addCategorie(@RequestBody categorie c){
        return categorieService.saveCetegorie(c);
    }

    @DeleteMapping("/categorie.delete{id}")
    @ResponseBody
    public void deleteCategorie(@PathVariable("id") int idCategorie){
        categorieService.deleteCategorieById(idCategorie);
    }
    
}
