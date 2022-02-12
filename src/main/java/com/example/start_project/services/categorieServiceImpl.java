package com.example.start_project.services;

import com.example.start_project.entities.categorie;
import com.example.start_project.repos.categorieRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class categorieServiceImpl implements categorieService{

    @Autowired
    categorieRepository categorieRepository;

    @Override
    public categorie saveCetegorie(categorie c) {
        return categorieRepository.save(c);
    }

    @Override
    public categorie updateCategorie(categorie c) {
        return categorieRepository.save(c);
    }

    @Override
    public void deleteCategorie(categorie c) {
        categorieRepository.delete(c);
    }

    @Override
    public void deleteCategorieById(int id) {
        categorieRepository.deleteById(id);
    }

    @Override
    public categorie getCategorie(int id) {
        return categorieRepository.getById(id);
    }

    @Override
    public List<categorie> getAllCategorie() {
        return categorieRepository.findAll();
    }
}
