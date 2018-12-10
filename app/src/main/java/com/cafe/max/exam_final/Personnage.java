package com.cafe.max.exam_final;

public class Personnage {

    private int idLayout;
    private String nom;
    private String profession;

    public Personnage(int idLayout, String nom, String profession) {
        this.idLayout = idLayout;
        this.nom = nom;
        this.profession = profession;
    }

    public int getIdLayout() {
        return idLayout;
    }

    public void setIdLayout(int idLayout) {
        this.idLayout = idLayout;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
