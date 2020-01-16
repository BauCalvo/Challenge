package com.challenge.Challenge.entities;

public class Mutant {
    private String[] dna;

    public Mutant(String[] dna) {
        this.dna = dna;
    }

    public Mutant() {
    }

    public String[] getDna() {
        return dna;
    }

    public void setDna(String[] dna) {
        this.dna = dna;
    }
}
