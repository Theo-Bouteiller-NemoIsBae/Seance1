package fr.univ_amu.iut;

import java.time.LocalDate;

public class Commercial extends Employe {

    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(int numEmpl, String numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double tauxHorraire, double nbrHeure, double chiffreAffaires, double tauxCommission) {
        super(numEmpl, numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, tauxHorraire, nbrHeure);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }

    public void negocierTransaction(){
        System.out.println("negocier transaction");
    }

    protected double getSalaireBrut(){
        return super.getTauxHorraire() + (chiffreAffaires * tauxCommission) + 100;
    }

}
