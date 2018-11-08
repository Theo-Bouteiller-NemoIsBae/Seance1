package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class GestionEntreprises {
    public static void main(String[] args) {
        List<Employe> employes = new ArrayList<Employe>();
        employes.add(new Vendeur(01, "secu01", "bouteiller", "theo", 1,
                    LocalDate.of(2017, Month.OCTOBER, 5), LocalDate.of(2017, Month.OCTOBER, 5), 5, 45, 5, 5));

        employes.add(new EmployeOrdinaire(02, "secu02", "alamelle", "vincent", 2,
                    LocalDate.of(2017, Month.OCTOBER, 5), LocalDate.of(2017, Month.OCTOBER, 5), 7, 35));

        employes.add(new Representant(03, "secu03", "arnouler", "baptiste", 2,
                    LocalDate.of(2017, Month.OCTOBER, 5), LocalDate.of(2017, Month.OCTOBER, 5), 8, 35, 5 ,5));

        employes.add(new Technicien(04, "secu04", "cardianle", "cesar", 4,
                    LocalDate.of(2017, Month.OCTOBER, 5), LocalDate.of(2017, Month.OCTOBER, 5), 1, 35, 5, 5));

        Entreprise entreprise = new Entreprise("maBoiteInfo", employes);
        System.out.println(entreprise);
    }
}
