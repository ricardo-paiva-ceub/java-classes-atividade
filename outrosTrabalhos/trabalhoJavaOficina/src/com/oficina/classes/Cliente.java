package com.oficina.classes;

import com.oficina.interfaces.ClienteInterface;


public class Cliente implements ClienteInterface {
    String nome, cpf, endereco, telefone;

    public Cliente(String newNome, String newCpf, String newEndereco, String newTelefone) {
        this.nome = newNome;
        this.cpf = newCpf;
        this.endereco = newEndereco;
        this.telefone = newTelefone;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String newNome) {
        this.nome = newNome;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCpf(String newCpf) {
        this.cpf = newCpf;
    }

    @Override
    public String getEndereco() {
        return this.endereco;
    }

    @Override
    public void setEndereco(String newEndereco) {
        this.endereco = newEndereco;
    }

    @Override
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public void setTelefone(String newTelefone) {
        this.telefone = newTelefone;
    }
}
