package fr.univ.amu.marcheFermier.PHRRT.Donnée.Trade;

import fr.univ.amu.marcheFermier.PHRRT.Donnée.Acheteur;
import fr.univ.amu.marcheFermier.PHRRT.Donnée.Producteur.Producteur;

import java.util.ArrayList;

public class PropositionVente { //Une Proposition de vente terminée devient une Transaction, qui sera elle-même insérée dans le Livre de Marché
    private Producteur monVendeur; //Qui vend
    private Produit monProduit; // Ce qu'il vend
    private int prix;
    private ArrayList<Acheteur> mesAcheteurs; //Acheteurs potentiels
    private boolean isValid; //True si l'AMF valide l'annonce, celle ci devient visible
    public void afficher(){ // à implémenter
        System.out.println("Ceci est une proposition de vente");
    }

    public PropositionVente(Producteur monVendeur, Produit monProduit, int prix) {
        this.monVendeur = monVendeur;
        this.monProduit = monProduit;
        this.prix = prix;
    }

    public Producteur getMonVendeur() {
        return monVendeur;
    }

    public void setMonVendeur(Producteur monVendeur) {
        this.monVendeur = monVendeur;
    }

    public Produit getMonProduit() {
        return monProduit;
    }

    public void setMonProduit(Produit monProduit) {
        this.monProduit = monProduit;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public ArrayList<Acheteur> getMesAcheteurs() {
        return mesAcheteurs;
    }

    public void setMesAcheteurs(ArrayList<Acheteur> mesAcheteurs) {
        this.mesAcheteurs = mesAcheteurs;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }


}
