package com.vestuario.classes;


import com.vestuario.interfaces.RoupaInterface;

public class Roupa implements RoupaInterface {

    protected String nome;
    protected String cor;
    protected int numManequim;
    protected String tecido;
    protected double preco;
    public LocalRoupa local;

    public Roupa(String newNome, String newCor, int newNumManequim, String newTecido, double newPreco, LocalRoupa newLocal) {
        this.nome = newNome;
        this.cor = newCor;
        this.numManequim = newNumManequim;
        this.tecido = newTecido;
        this.preco = newPreco;
        this.local = newLocal;

        this.local.incluirRoupa(this);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String newNome) {
        this.cor = newNome;
    }

    @Override
    public String getCor() {
        return this.cor;
    }

    @Override
    public void setCor(String newCor) {
        this.cor = newCor;
    }

    @Override
    public int getNumManequim() {
        return this.numManequim;
    }

    @Override
    public void setNumManequim(int newNumManequim) {
        this.numManequim = newNumManequim;
    }

    @Override
    public String getTecido() {
        return this.tecido;
    }

    @Override
    public void setTecido(String newTecido) {
        this.tecido = newTecido;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void setPreco(double newPreco) {
        this.preco = newPreco;
    }

    @Override
    public String getLocalRoupa() {
        return this.local.getNome();
    }

    @Override
    public void setLocalRoupa(LocalRoupa newLocalRoupa) {
        this.local.retirarRoupa(this);

        this.local = newLocalRoupa;
        this.local.incluirRoupa(this);
    }

}
