package com.vestuario.classes;


import com.vestuario.interfaces.LocalRoupaInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LocalRoupa implements LocalRoupaInterface {
    protected ArrayList<Roupa> listaRoupas;
    protected String nome;

    public LocalRoupa (String newNome) {
        this.nome = newNome;
        this.listaRoupas = new ArrayList<Roupa>();
    }

    @Override
    public ArrayList<Roupa> getRoupas() {
        return this.listaRoupas;
    }

    @Override
    public void incluirRoupa(Roupa novaRoupa) {
        this.listaRoupas.add(novaRoupa);
    }

    @Override
    public void retirarRoupa(Roupa roupaRetirada) {
        this.listaRoupas.remove(roupaRetirada);
    }

    @Override
    public int countRoupas() {
        return this.listaRoupas.size();
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
    public String getPredCor() {
        HashMap<String, Integer> cores = new HashMap<String, Integer>();
        int maiorFrequenciaCor = -1;
        String maiorStringCor = "";

        for (Roupa roupa : listaRoupas) {

            if (!cores.containsKey(roupa.cor)) {
                cores.put(roupa.cor, 1);
            } else {
                cores.put(roupa.cor, cores.get(roupa.cor) + 1);
            }

        }

        for (Map.Entry<String, Integer> entry: cores.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (value > maiorFrequenciaCor) {
                maiorFrequenciaCor = value;
                maiorStringCor = key;
            } else if (value == maiorFrequenciaCor) {
                maiorStringCor = "Não há cor predominante.";
            }
        }

        if (maiorFrequenciaCor == -1) {
            maiorStringCor = "Não há roupas neste local.";
        }

        return maiorStringCor;
    }

}
