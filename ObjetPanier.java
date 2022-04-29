public class ObjetPanier {

    private final Produit produit;

    private Integer quantite;

    public ObjetPanier(Produit produit, Integer quantite) {
        super();
        this.produit = produit;
        this.quantite = quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer ajouterUn() {
        return quantite = quantite + 1;
    }

    public Integer retirerUn() {
        return quantite = quantite - 1;
    }


}