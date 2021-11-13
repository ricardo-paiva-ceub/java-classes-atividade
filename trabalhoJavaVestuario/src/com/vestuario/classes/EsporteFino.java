package com.vestuario.classes;

public class EsporteFino extends Roupa {
    private boolean abotoada;

    public EsporteFino(String newNome, String newCor, int newNumManequim, String newTecido, double newPreco, LocalRoupa newLocal, boolean newAbotoada) {
        super(newNome, newCor, newNumManequim, newTecido, newPreco, newLocal);

        this.abotoada = newAbotoada;
    }

    public boolean getAbotoada() {

        return this.abotoada;
    }

    public void toggleAbotoada() {

        this.abotoada = !this.abotoada;
    }
}
