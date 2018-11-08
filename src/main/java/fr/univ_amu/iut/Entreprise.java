package fr.univ_amu.iut;

import java.util.List;

public class Entreprise {
    private String nom;
    private List<Employe> employes;


    public Entreprise(String nom, List<Employe> employes) {
        this.nom = nom;
        this.employes = employes;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nom='" + nom + '\'' +
                ", employes=" + employes +
                '}';
    }
}
