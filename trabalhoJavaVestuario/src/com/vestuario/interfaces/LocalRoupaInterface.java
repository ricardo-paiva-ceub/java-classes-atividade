package com.vestuario.interfaces;

import java.util.ArrayList;

public interface LocalRoupaInterface {
    ArrayList<com.vestuario.classes.Roupa> getRoupas();
    void incluirRoupa(com.vestuario.classes.Roupa novaRoupa);
    void retirarRoupa(com.vestuario.classes.Roupa roupaRetirada);
    int countRoupas();
    String getNome();
    void setNome(String newNome);
    String getPredCor();
}
