package tn.enis.compte;

public class Compte {
    private String cin;
    private double solde;

    public Compte(String cin, double solde) {
        this.cin = cin;
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public String getCin() {
        return cin;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        solde -= montant;
    }
}