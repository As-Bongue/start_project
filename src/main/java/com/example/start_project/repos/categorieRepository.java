package com.example.start_project.repos;

import com.example.start_project.entities.categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categorieRepository extends JpaRepository<categorie, Integer> {
}
