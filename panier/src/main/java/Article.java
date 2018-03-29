package main.java;

public class Article{

    private	int id;
    private int nombre;
    private int prix;

    // Constructor
    Article(int id, int nbr, int prix)
    {
        this.setId(id);
        this.setNombre(nbr);
        this.setPrix(prix);
    }


    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}