package main.java;

import java.util.*;

public class Panier {
    private List<Article> articles;

    Panier() {
        this.articles = new ArrayList<Article>();
    }

    public void ajouterArticle(int idArticle, int nombre, int prix) {
        Article article = this.getArticle(idArticle);
        if (article.getNombre() == 0) {
            article = new Article(idArticle, nombre, prix);
        }
        else {
            article.setNombre(article.getNombre() + nombre);
            this.supprimerArticle(idArticle);
        }
        articles.add(article);
    }

    public void supprimerArticle(int idArticle) {
        Iterator<Article> articlesIt = articles.iterator();
        while (articlesIt.hasNext()) {
            if (articlesIt.next().getId() == idArticle) {
                articlesIt.remove();
            }
        }
    }

    public void visualiserPanier(){
        System.out.println("votre panier contient :");
        for(Article article : articles) {
            System.out.println("*** Article : " + article.getId() + " *** Nombre : " + article.getNombre() + " *** Prix Unité : " + article.getPrix());
        }
    }

    public int calculerPanier() {
        int somme = 0;
        for(Article article : articles) {
            somme += (article.getPrix() * article.getNombre());
        }
        return somme;
    }



    public Article getArticle(int idArticle) {
        for(Article article : articles) {
            if (article.getId() == idArticle) {
                return article;
            }
        }
        Article art = new Article(idArticle,0,0);
        return art;
    }
}