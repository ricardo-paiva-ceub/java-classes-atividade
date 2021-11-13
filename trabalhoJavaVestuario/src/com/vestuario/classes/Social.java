package com.vestuario.classes;

public class Social extends Roupa {
    private String tipoManga;

    public Social(String newNome, String newCor, int newNumManequim, String newTecido, double newPreco, LocalRoupa newLocal, String newTipoManga) {
        super(newNome, newCor, newNumManequim, newTecido, newPreco, newLocal);

        this.tipoManga = newTipoManga;
    }

    public String getTipoManga() {

        return this.tipoManga;
    }

    public void setTipoManga(String newTipoManga) {

        this.tipoManga = newTipoManga;
    }
}
