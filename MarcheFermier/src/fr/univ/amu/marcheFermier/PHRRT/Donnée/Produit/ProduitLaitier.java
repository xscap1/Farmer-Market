package fr.univ.amu.marcheFermier.PHRRT.Donnée.Produit;

import java.time.LocalDate;

public abstract class ProduitLaitier extends ProduitFermier {
    public ProduitLaitier(LocalDate peremptionDate, double prix) {
        super(peremptionDate, prix);
    }
}
