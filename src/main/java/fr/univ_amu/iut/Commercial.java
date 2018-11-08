package fr.univ_amu.iut;

import java.time.LocalDate;

public class Commercial extends Employe {
    public Commercial(int numEmpl, String numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, int tauxHorraire, int nbrHeure) {
        super(numEmpl, numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, tauxHorraire, nbrHeure);
    }

    public void negocierTransaction(){
        System.out.println("negocier transaction");
    }


}
