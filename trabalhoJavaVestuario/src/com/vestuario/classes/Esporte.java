package com.vestuario.classes;

public class Esporte extends Roupa {
    private boolean paraCalor;

    public Esporte(String newNome, String newCor, int newNumManequim, String newTecido, double newPreco, LocalRoupa newLocal, boolean newParaCalor) {
        super(newNome, newCor, newNumManequim, newTecido, newPreco, newLocal);

        this.paraCalor = newParaCalor;
    }

    public boolean getParaCalor() {

        return this.paraCalor;
    }
    public void toggleParaCalor() {

        this.paraCalor = !this.paraCalor;
    }
}
