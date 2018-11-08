package fr.univ_amu.iut;

import java.time.LocalDate;

public class Representant extends Commercial{

    private double chiffreAffaires;
    private double tauxCommission;

    public Representant(int numEmpl, String numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double tauxHorraire, double nbrHeure, double chiffreAffaires, double tauxCommission) {
        super(numEmpl, numSecu, nom, prenom, echelon, dateNaissance, dateEmbauche, tauxHorraire, nbrHeure, chiffreAffaires, tauxCommission);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }

    protected double getSalaireBrut(){
        EmployeOrdinaire employeTemp = new EmployeOrdinaire(0, null, null, null, this.getEchelon() ,null,null, this.getTauxHorraire(), this.getNbrHeure());
        return employeTemp.getTauxHorraire() + (chiffreAffaires * tauxCommission) + 100;
    }

}
