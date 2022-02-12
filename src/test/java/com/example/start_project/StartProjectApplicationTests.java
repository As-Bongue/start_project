package com.example.start_project;

import com.example.start_project.entities.produit;
import com.example.start_project.repos.produitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;


@SpringBootTest
class StartProjectApplicationTests {

    @Autowired
    private produitRepository produitRepository;

    @Test
    public void testCreateProduit(){
        produit prod = new produit("pc tochiba",2450.500, new Date());
        produitRepository.save(prod);
    }

    @Test
    public void testFindProduct(){
        produit p = produitRepository.findById(1).get();
        System.out.println(p);
    }

    @Test
    public  void testUpdateProduit(){
        produit p = produitRepository.findById(1).get();
        p.setPrixProduit(450.32);
        produitRepository.save(p);
    }

    @Test
    public void testDeleteProduit(){
        produitRepository.deleteById(1);
    }

    @Test
    public void testFindAllProduit(){
        List<produit> prods = produitRepository.findAll();
        for (produit p:prods)
            System.out.println(p);
    }
}
