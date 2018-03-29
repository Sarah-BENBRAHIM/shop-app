package main.test.java

import main.java.Article
import main.java.Panier
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by EBIZNEXT on 29/03/2018.
 */
class PanierTest extends GroovyTestCase {



    /*@Before
    public void setup() {
        Article article1 = new Article(0,1,10);
        Article article2 = new Article(1,1,20);
    }

    @AfterClass
    public static void shutDown() {
        System.out.println("AfterClass");
    }*/

    @Before
    public static void setUp() {
        P
    }



    @Test
    void testAjouterArticle() {
        Panier basket = new Panier();
        basket.ajouterArticle(11,1,200);
        assertEquals(1,basket.articles.size());
    }

    void testSupprimerArticle() {
        anier panier = new Panier();
        Article article1 = new Article(0,1,10);
        Article article2 = new Article(1,1,20);
        panier.ajouterArticle(article1);
        panier.ajouterArticle(article2);
        panier.supprimerArticle(0);
        assertEquals(1,panier.articles.size());
    }
}
