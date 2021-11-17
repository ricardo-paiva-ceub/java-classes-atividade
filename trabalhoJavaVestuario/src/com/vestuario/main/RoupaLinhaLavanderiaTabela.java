package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoupaLinhaLavanderiaTabela extends RoupaLinhaTabela {
    JButton retirarRoupaButton;

    public RoupaLinhaLavanderiaTabela(Roupa roupa, JPanel painelAlvo, JLabel qtdRoupasLabel, JLabel corPredRoupasLabel) {
        super(roupa, roupa.getNome() + " - Cor: " + roupa.getCor());

        retirarRoupaButton = new JButton("Retirar");


        this.linhaTabelaPanel.add(retirarRoupaButton);

        this.adicionarAoPainelRevalidar(painelAlvo);


        retirarRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                roupa.setLocalRoupa(Main.guardaRoupa);

                qtdRoupasLabel.setText("Quantidade de roupas na Lavanderia: " + Main.lavanderia.countRoupas());
                corPredRoupasLabel.setText("Cor predominante na Lavanderia: " + Main.lavanderia.getPredCor());

                removerDoPainelRepintar(painelAlvo);
                JOptionPane.showMessageDialog(painelAlvo, roupa.getNome() + " retirada da Lavandeira e colocada no seu Guarda-Roupas.");

            }
        });
    }
}
