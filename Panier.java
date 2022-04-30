import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<ObjetPanier> ListeObjetPanier = new ArrayList<>();

    private Float Prixsanslivraison = 0.0f;

    private Integer PrixLivraison = 0;

    private Float Prixtotal = 0.0f;

    public List<ObjetPanier> getListeObjetPanier() {
        return ListeObjetPanier;
    }

    public void setListeObjetPanier(List<ObjetPanier> listeObjetPanier) {
        ListeObjetPanier = listeObjetPanier;
    }

    public Float getPrixsanslivraison() {
        return Prixsanslivraison;
    }

    public void setPrixsanslivraison(Float prixsanslivraison) {
        Prixsanslivraison = prixsanslivraison;
    }

    public Integer getPrixLivraison() {
        return PrixLivraison;
    }

    public void setPrixLivraison(Integer prixLivraison) {
        PrixLivraison = prixLivraison;
    }

    public Float getPrixtotal() {
        return Prixtotal;
    }

    public void setPrixtotal(Float prixtotal) {
        Prixtotal = prixtotal;
    }

    public void ajouterObjetPanier(ObjetPanier ObjetPanier) {
        int indexPosition = ListeObjetPanier.indexOf(ObjetPanier);
        if( indexPosition != -1) {
            ObjetPanier = ListeObjetPanier.get(indexPosition);
            ObjetPanier.ajouterUn();
        }else {
            ListeObjetPanier.add(ObjetPanier);
        }
        rafraichirTotal();
    }

    public Boolean enleverObjetPanier(ObjetPanier ObjetPanier) {
        Boolean isLineItemRemoved = ListeObjetPanier.remove(ObjetPanier);
        rafraichirTotal();
        return isLineItemRemoved;
    }

    private void rafraichirTotal() {
        Prixsanslivraison = 0.0f;
        ListeObjetPanier.forEach(item -> Prixsanslivraison += item.getPrixProduit());
        if (Prixsanslivraison >= 100) {
            PrixLivraison = 0;
        }
        else if (Prixsanslivraison < 50) {
            PrixLivraison = 5;
        }

        else {
            PrixLivraison = 8;
        }
        Prixtotal = Prixsanslivraison + PrixLivraison;
    }

}