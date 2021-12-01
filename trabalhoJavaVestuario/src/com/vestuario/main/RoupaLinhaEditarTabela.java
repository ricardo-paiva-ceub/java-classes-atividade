package com.vestuario.main;

import com.vestuario.classes.LocalRoupa;
import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoupaLinhaEditarTabela extends RoupaLinhaTabela {
    public JButton editarRoupaButton;

    public RoupaLinhaEditarTabela(Roupa roupa, JPanel painelAlvo, EditarRoupa editarRoupaInstanciaJanela) {
        super(roupa, roupa.getNome() + " - Cor: " + roupa.getCor() + " - Local: " + roupa.getLocalRoupa());

        editarRoupaButton = new JButton("Editar");

        this.linhaTabelaPanel.add(this.editarRoupaButton);
        this.editarRoupaButton.setBackground(Color.cyan);

        this.adicionarAoPainelRevalidar(painelAlvo);

        editarRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameDialogoEditarRoupa = new JFrame("Editar " + roupa.getNome());
                frameDialogoEditarRoupa.setContentPane(new EditarRoupaDialogo(frameDialogoEditarRoupa, roupa, editarRoupaInstanciaJanela).editarDialogoRoupaPanel);
                frameDialogoEditarRoupa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameDialogoEditarRoupa.pack();
                frameDialogoEditarRoupa.setVisible(true);
            }
        });
    }
}
