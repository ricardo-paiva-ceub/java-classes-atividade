package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RoupasEmUso {
    public JPanel roupasEmUsoPanel;
    public JPanel listaRoupasEmUsoPanel;
    private JLabel roupasEmUsoLabel;
    private JLabel qtdRoupasEmUsoLabel;
    private JLabel corPredEmUsoLabel;
    private JButton sairRoupasEmUsoButton;

    public ArrayList<RoupaLinhaEmUsoTabela> listaRoupasLinhaEmUso = new ArrayList<>();

    public RoupasEmUso(JFrame parentFrame) {
        listaRoupasEmUsoPanel.setLayout(new BoxLayout(listaRoupasEmUsoPanel, BoxLayout.Y_AXIS));
        qtdRoupasEmUsoLabel.setText("Quantidade de roupas em uso: " + Main.emUso.countRoupas());
        corPredEmUsoLabel.setText("Cor predominante em uso: " + Main.emUso.getPredCor());

        for (Roupa roupa : Main.emUso.getRoupas()) {
            listaRoupasLinhaEmUso.add(new RoupaLinhaEmUsoTabela(roupa, listaRoupasEmUsoPanel, qtdRoupasEmUsoLabel, corPredEmUsoLabel));
            listaRoupasEmUsoPanel.revalidate();
        }


        sairRoupasEmUsoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentFrame.dispose();
            }
        });
    }
}
