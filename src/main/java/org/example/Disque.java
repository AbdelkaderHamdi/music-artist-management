package org.example;
import java.util.ArrayList;

public class Disque extends Oeuvre  implements  Publiable, Vendable{
    private String titre;
    private ArrayList<Chanson> liste;

    public Disque(int capacite, int annee, String genre, String titre) {
        super(capacite, annee, genre);
        this.titre = titre;
        this.liste = new ArrayList<>();
    }

    public int getCapaciteLibre() {
        // Calculer la capacité libre
        int capaciteUtilisee = 0;
        for (Chanson c : liste) {
            capaciteUtilisee += c.getCapacite();
        }
        return this.getCapacite() - capaciteUtilisee;
    }

    public boolean addChanson(Chanson s) {
        if (getCapaciteLibre() >= s.getCapacite()) {
            liste.add(s);
            return true;
        } else {
            return false;
        }
    }

    public int nbChansons() {
        return liste.size();
    }

    @Override
    public String nomPub() {
        return titre + getAnnee();
    }

    @Override
    public int prix() {
        return 60;
    }
}
