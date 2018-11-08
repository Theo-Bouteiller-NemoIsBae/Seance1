package fr.univ_amu.iut;

import java.time.LocalDate;

public class EmployeOrdinaire extends Employe {
    public EmployeOrdinaire(int numEmpl, String numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, int tauxHorraire, int nbrHeure) {
        super(numEmpl, numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, tauxHorraire, nbrHeure);
    }

    public void effectuerTacheOrdinaire(){
        System.out.println("effectuer tache ordinaire");
    }
}
