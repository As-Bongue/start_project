package com.example.start_project.repos;

import com.example.start_project.entities.produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produitRepository extends JpaRepository<produit, Integer> {

}
