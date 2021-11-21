package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoupaLinhaGuardaRoupaTabela extends RoupaLinhaTabela{
    JButton lavarRoupaButton;
    JButton usarRoupaButton;

    public RoupaLinhaGuardaRoupaTabela(Roupa roupa, JPanel painelAlvo, JLabel qtdRoupasLabel, JLabel corPredRoupasLabel) {
        super(roupa, roupa.getNome() + " - Cor: " + roupa.getCor());

        lavarRoupaButton = new JButton("Lavar");
        usarRoupaButton = new JButton("Vestir");
        usarRoupaButton.setBackground(Color.GREEN);

        this.linhaTabelaPanel.add(lavarRoupaButton);
        this.linhaTabelaPanel.add(usarRoupaButton);

        this.adicionarAoPainelRevalidar(painelAlvo);

        lavarRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                roupa.setLocalRoupa(Main.lavanderia);

                qtdRoupasLabel.setText("Quantidade de roupas no Guarda-Roupas : " + Main.guardaRoupa.countRoupas());
                corPredRoupasLabel.setText("Cor predominante no Guarda-Roupas : " + Main.guardaRoupa.getPredCor());

                removerDoPainelRepintar(painelAlvo);
                JOptionPane.showMessageDialog(painelAlvo, roupa.getNome() + " retirada do seu Guarda-Roupas e colocada na Lavanderia.");

            }
        });

        usarRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                roupa.setLocalRoupa(Main.emUso);

                qtdRoupasLabel.setText("Quantidade de roupas no Guarda-Roupas : " + Main.guardaRoupa.countRoupas());
                corPredRoupasLabel.setText("Cor predominante no Guarda-Roupas : " + Main.guardaRoupa.getPredCor());

                removerDoPainelRepintar(painelAlvo);
                JOptionPane.showMessageDialog(painelAlvo, "Roupa" + roupa.getNome() + " vestida!");

            }
        });
    }
}
