package com.oficina.interfaces;

//        + getPlaca():String
//        + setPlaca(newPlaca:String):void
//        + getAno():int
//        + setAno(newAno:int):void
//        + getModelo():String
//        + setModelo(newModelo:String):void
//        + getNumChassi():String
//        + setNumChassi(newNumChassi:String):void
//        + getTipoCombustivel():String
//        + setTipoCombustivel(newTipoCombustivel:String):void
//        + changeCliente(newCliente:Cliente):void

import com.oficina.classes.Cliente;

public interface AutomovelInterface {
    String getPlaca();
    void setPlaca(String newPlaca);
    int getAno();
    void setAno(int newAno);
    String getModelo();
    void setModelo(String newModelo);
    String getNumChassi();
    void setNumChassi(String newNumChassi);
    String getTipoCombustivel();
    void setTipoCombustivel(String newTipoCombustivel);
    void changeProprietario(Cliente newProprietario);
}
