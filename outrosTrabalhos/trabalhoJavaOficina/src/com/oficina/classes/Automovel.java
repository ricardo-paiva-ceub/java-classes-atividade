package com.oficina.classes;

import com.oficina.interfaces.AutomovelInterface;

public class Automovel implements AutomovelInterface {
    String placa;
    int ano;
    String modelo;
    String numChassi;
    String tipoCombustivel;
    Cliente proprietario;

    public Automovel(String newPlaca, int newAno, String newModelo, String newNumChassi, String newTipoCombustivel, Cliente newProprietario) {
        this.placa = newPlaca;
        this.ano = newAno;
        this.modelo = newModelo;
        this.numChassi = newNumChassi;
        this.tipoCombustivel = newTipoCombustivel;
        this.proprietario = newProprietario;
    }

    @Override
    public String getPlaca() {
        return this.placa;
    }

    @Override
    public void setPlaca(String newPlaca) {
        this.placa = newPlaca;
    }

    @Override
    public int getAno() {
        return this.ano;
    }

    @Override
    public void setAno(int newAno) {
        this.ano = newAno;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    @Override
    public void setModelo(String newModelo) {
        this.modelo = newModelo;
    }

    @Override
    public String getNumChassi() {
        return this.numChassi;
    }

    @Override
    public void setNumChassi(String newNumChassi) {
        this.numChassi = newNumChassi;
    }

    @Override
    public String getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    @Override
    public void setTipoCombustivel(String newTipoCombustivel) {
        this.tipoCombustivel = newTipoCombustivel;
    }

    @Override
    public void changeProprietario(Cliente newProprietario) {
        this.proprietario = newProprietario;
    }
}
