package com.vestuario.main;

import com.vestuario.classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoupaLinhaExcluirTabela extends RoupaLinhaTabela {
    JButton excluirRoupaButton;

    public RoupaLinhaExcluirTabela(Roupa roupa, JPanel painelAlvo) {
        super(roupa, roupa.getNome() + " - Cor: " + roupa.getCor() + " - Local: " + roupa.getLocalRoupa());

        excluirRoupaButton = new JButton("Excluir");

        this.linhaTabelaPanel.add(this.excluirRoupaButton);
        this.excluirRoupaButton.setBackground(Color.RED);

        this.adicionarAoPainelRevalidar(painelAlvo);

        excluirRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int escolhaConfirmacaoDelecao = JOptionPane.showConfirmDialog(painelAlvo, "Tem certeza que deseja excluir a roupa " + roupa.getNome() + "?", "Atenção", dialogButton);

                if (escolhaConfirmacaoDelecao == JOptionPane.YES_OPTION) {
                    Main.instanciasRoupasCriadas.remove(roupa);
                    roupa.local.retirarRoupa(roupa);

                    removerDoPainelRepintar(painelAlvo);
                    JOptionPane.showMessageDialog(painelAlvo, roupa.getNome() + " excluído!");

                }

            }
        });
    }
}
