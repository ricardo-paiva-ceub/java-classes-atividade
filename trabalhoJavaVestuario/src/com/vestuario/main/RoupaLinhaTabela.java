package com.vestuario.main;

import com.vestuario.classes.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoupaLinhaTabela {
    JLabel descricaoRoupa;
    JButton excluirRoupa;

    public RoupaLinhaTabela(Roupa roupa, JPanel painelAlvo) {
        descricaoRoupa = new JLabel(roupa.getNome() + " - Cor: " + roupa.getCor() + " - Local: " + roupa.getLocalRoupa());
        excluirRoupa = new JButton("Excluir");

        painelAlvo.add(descricaoRoupa);
        painelAlvo.add(excluirRoupa);
        painelAlvo.revalidate();

        excluirRoupa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.instanciasRoupasCriadas.remove(roupa);
                roupa.local.retirarRoupa(roupa);

                painelAlvo.remove(descricaoRoupa);
                painelAlvo.remove(excluirRoupa);
                painelAlvo.revalidate();
                painelAlvo.repaint();
                JOptionPane.showMessageDialog(null, roupa.getNome() + " excluído!");
            }
        });
    }
}
