package main.java;

/**
 * Created by EBIZNEXT on 29/03/2018.
 */
public class Shopping {

    public static void main(String[] args){
        Panier panier = new Panier();
        panier.ajouterArticle(0,2,10);
        panier.supprimerArticle(0);

    }
}
