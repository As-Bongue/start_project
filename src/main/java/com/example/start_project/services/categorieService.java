package com.example.start_project.services;

import com.example.start_project.entities.categorie;

import java.util.List;

public interface categorieService {

    categorie saveCetegorie(categorie c);
    categorie updateCategorie(categorie c);
    void deleteCategorie(categorie c);
    void deleteCategorieById(int id);
    categorie getCategorie(int id);
    List<categorie> getAllCategorie();
}
