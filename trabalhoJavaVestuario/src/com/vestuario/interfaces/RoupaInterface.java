package com.vestuario.interfaces;

import com.vestuario.classes.LocalRoupa;

public interface RoupaInterface {
    String getNome();

    void setNome(String newNome);

    String getCor();

    void setCor(String newCor);

    int getNumManequim();

    void setNumManequim(int newNumManequim);

    String getTecido();

    void setTecido(String newTecido);

    double getPreco();

    void setPreco(double newPreco);

    String getLocalRoupa();

    void setLocalRoupa(LocalRoupa newLocalRoupa);
}