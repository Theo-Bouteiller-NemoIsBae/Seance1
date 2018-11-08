package fr.univ_amu.iut;

import java.time.LocalDate;

public class Vendeur extends Commercial{
    public Vendeur(int numEmpl, String numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double tauxHorraire, double nbrHeure, double chiffreAffaires, double tauxCommission) {
        super(numEmpl, numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, tauxHorraire, nbrHeure, chiffreAffaires, tauxCommission);
    }
    
}
