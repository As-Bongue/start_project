package com.example.start_project.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategorie;
    private String libeleCategorie;

    @OneToMany(mappedBy = "categorie")
    private List<produit> produits;

    public List<produit> getProduits() {
        return produits;
    }

    public void setProduits(List<produit> produits) {
        this.produits = produits;
    }

    public categorie() {
    }

    public categorie(String libeleCategorie) {
        this.libeleCategorie = libeleCategorie;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getLibeleCategorie() {
        return libeleCategorie;
    }

    public void setLibeleCategorie(String libeleCategorie) {
        this.libeleCategorie = libeleCategorie;
    }

    @Override
    public String toString() {
        return "categorie{" +
                "idCategorie=" + idCategorie +
                ", libeleCategorie='" + libeleCategorie + '\'' +
                '}';
    }
}
