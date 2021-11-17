package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.*;

public class RoupaLinhaTabela {
    protected JPanel linhaTabelaPanel;
    protected JLabel descricaoRoupaLabel;

    public RoupaLinhaTabela(Roupa roupa, String stringDescricaoRoupa) {

        linhaTabelaPanel = new JPanel();
        linhaTabelaPanel.setLayout(new FlowLayout());

        descricaoRoupaLabel = new JLabel(stringDescricaoRoupa);

        linhaTabelaPanel.add(descricaoRoupaLabel);


    }

    public void adicionarAoPainelRevalidar(JPanel painelAlvo) {
        painelAlvo.add(this.linhaTabelaPanel);
        painelAlvo.revalidate();
    }

    public void removerDoPainelRepintar(JPanel painelAlvo) {
        painelAlvo.remove(this.linhaTabelaPanel);
        painelAlvo.revalidate();
        painelAlvo.repaint();
    }
}
