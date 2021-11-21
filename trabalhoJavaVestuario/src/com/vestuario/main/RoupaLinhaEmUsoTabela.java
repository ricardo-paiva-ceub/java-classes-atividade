package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoupaLinhaEmUsoTabela extends RoupaLinhaTabela {
    JButton lavarRoupaButton;
    JButton guardarRoupaButton;


    public RoupaLinhaEmUsoTabela(Roupa roupa, JPanel painelAlvo, JLabel qtdRoupasLabel, JLabel corPredRoupasLabel) {
        super(roupa, roupa.getNome() + " - Cor: " + roupa.getCor());

        lavarRoupaButton = new JButton("Lavar");
        guardarRoupaButton = new JButton("Guardar");
        guardarRoupaButton.setBackground(Color.YELLOW);

        this.linhaTabelaPanel.add(lavarRoupaButton);
        this.linhaTabelaPanel.add(guardarRoupaButton);

        this.adicionarAoPainelRevalidar(painelAlvo);

        lavarRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                roupa.setLocalRoupa(Main.lavanderia);

                qtdRoupasLabel.setText("Quantidade de roupas em uso : " + Main.emUso.countRoupas());
                corPredRoupasLabel.setText("Cor predominante em uso : " + Main.emUso.getPredCor());

                removerDoPainelRepintar(painelAlvo);
                JOptionPane.showMessageDialog(painelAlvo, "Roupa" + roupa.getNome() + " colocada na Lavanderia.");

            }
        });

        guardarRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                roupa.setLocalRoupa(Main.guardaRoupa);

                qtdRoupasLabel.setText("Quantidade de roupas em uso : " + Main.emUso.countRoupas());
                corPredRoupasLabel.setText("Cor predominante em uso : " + Main.emUso.getPredCor());

                removerDoPainelRepintar(painelAlvo);
                JOptionPane.showMessageDialog(painelAlvo, "Roupa" + roupa.getNome() + " guardada no Guarda-Roupas.");

            }
        });
    }
}
