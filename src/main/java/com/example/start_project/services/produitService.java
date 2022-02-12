package com.example.start_project.services;

import com.example.start_project.entities.produit;

import java.util.List;

public interface produitService {
    produit saveProduit(produit p);
    produit updateProduit(produit p);
    void deleteProduit(produit p);
    void deleteProduitById(int id);
    produit getProduit(int id);
    List<produit> getAllProduit();
}
