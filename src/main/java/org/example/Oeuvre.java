package org.example;

public class Oeuvre {
        private int capacite;
        private int annee;
        private String genre;

        public Oeuvre(int capacite, int annee, String genre) {
            this.capacite = capacite;
            this.annee = annee;
            this.genre = genre;
        }

        public String getGenre() {
            return genre;
        }

    public int getAnnee() {
        return annee;
    }

    public int getCapacite() {
        return capacite;
    }
}



