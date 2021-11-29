package com.oficina.classes;

//        # nome:String
//        # veiculo:Automovel
//
//        + getNome():String
//        + setNome(newNome):void
//        + changeVeiculo(newVeiculo:Veiculo):void

public class Peca {
    String nome;
    Automovel veiculo;

    public Peca(String newNome, Automovel newVeiculo) {
        this.nome = newNome;
        this.veiculo = newVeiculo;
    }
}
