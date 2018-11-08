package fr.univ_amu.iut;

import java.time.LocalDate;

public class Technicien extends Employe {

    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Technicien(int numEmpl, String numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double tauxHorraire, double nbrHeure, int nbUnitesProduites, double tauxCommissionUnite) {
        super(numEmpl, numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, tauxHorraire, nbrHeure);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    public void fabriquerProduit() {
        System.out.println("fabriquer produit");
    }

    private double getSalaireBrut(){
        return super.getSalaireBrute() + (nbUnitesProduites * tauxCommissionUnite);
    }
}
