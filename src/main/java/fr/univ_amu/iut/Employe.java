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
    protected double tauxHorraire;
    protected double nbrHeure;


    public Employe(int numEmpl, String numSecu, String nom, String prenom, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, double tauxHorraire, double nbrHeure) {
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

    protected int getEchelon() {
        return echelon;
    }

    protected double getTauxHorraire() {
        return tauxHorraire;
    }

    protected double getSalaireBrute(){
        return (this.tauxHorraire * this.nbrHeure) + 100;
    }

    private double getSalaireNet(){
        return getSalaireBrute() * 0.8;
    }

    protected double getNbrHeure(){
        return nbrHeure;
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
                '}' + "\n";
    }
}
