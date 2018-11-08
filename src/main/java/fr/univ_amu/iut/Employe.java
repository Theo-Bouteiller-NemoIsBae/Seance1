package fr.univ_amu.iut;

import java.time.LocalDate;

public class Employe {
    private int numEmpl;
    private String numSecu;
    private String nom;
    private String prenom;
    private int echelon;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private double tauxHorraire;
    private double nbrHeure;


    public Employe(int numEmpl, String numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, int tauxHorraire, int nbrHeure) {
        this.numEmpl = numEmpl;
        this.numSecu = numSecu;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon = echelon;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.tauxHorraire = tauxHorraire;
        this.nbrHeure = nbrHeure;
    }

    private double getSalaireBrute(){
        return this.tauxHorraire * this.nbrHeure;
    }

    private double getSalaireNet(){
        return getSalaireBrute() * 0.8;
    }

    @Override
    public String toString() {
        return "employe{" +
                "numEmpl=" + numEmpl +
                ", numSecu='" + numSecu + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", echelon=" + echelon +
                ", dateNaissance=" + dateNaissance +
                ", dateEmbauche=" + dateEmbauche +
                ", salaire brut =" + getSalaireBrute() +
                ", salaire net =" + getSalaireNet() +
                '}';
    }
}