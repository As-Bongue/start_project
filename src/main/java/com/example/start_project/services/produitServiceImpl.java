package com.example.start_project.services;

import com.example.start_project.entities.produit;
import com.example.start_project.repos.produitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class produitServiceImpl implements produitService{

    @Autowired
    produitRepository produitRepository;

    @Override
    public produit saveProduit(produit p) {
        return produitRepository.save(p);
    }

    @Override
    public produit updateProduit(produit p) {
        return produitRepository.save(p);
    }

    @Override
    public void deleteProduit(produit p) {
        produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(int id) {
        produitRepository.deleteById(id);
    }

    @Override
    public produit getProduit(int id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public List<produit> getAllProduit() {
        return produitRepository.findAll();
    }
}
