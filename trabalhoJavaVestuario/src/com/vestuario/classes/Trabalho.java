package com.vestuario.classes;

public class Trabalho extends Roupa {
    private String idUniforme;

    public Trabalho(String newNome, String newCor, int newNumManequim, String newTecido, double newPreco, LocalRoupa newLocal, String newIdUniforme) {
        super(newNome, newCor, newNumManequim, newTecido, newPreco, newLocal);

        this.idUniforme = newIdUniforme;
    }

    public String getIdUniforme() {

        return this.idUniforme;
    }

    public void setIdUniforme(String newIdUniforme) {

        this.idUniforme = newIdUniforme;
    }
}
