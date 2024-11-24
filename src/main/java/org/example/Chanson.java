package org.example;

import java.util.ArrayList;

public class Chanson extends Oeuvre implements Publiable {
    private String nomChanteur;

    public Chanson(int capacite, int annee, String genre, String nomChanteur) {
        super(capacite, annee, genre);
        this.nomChanteur = nomChanteur;
    }

    @Override
    public String nomPub() {
        return nomChanteur + getAnnee();
    }
}