package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RoupasGuardaRoupa {
    public JPanel roupasGuardaRoupaPanel;
    private JPanel listaRoupasGuardaRoupaPanel;
    private JLabel roupasGuardaRoupaLabel;
    private JLabel qtdRoupasGuardaRoupaLabel;
    private JLabel corPredGuardaRoupaLabel;
    private JButton sairGuardaRoupaButton;
    private JPanel imageGuardaRoupaPanel;
    private JLabel imageGuardaRoupaLabel;

    public ArrayList<RoupaLinhaGuardaRoupaTabela> listaRoupasLinhaGuardaRoupaTabela = new ArrayList<>();

    public RoupasGuardaRoupa(JFrame parentFrame) {
//        Carregar a imagem da Lavanderia no JPanel imagemLavanderiaPanel
        ImageIcon imageGuardaRoupaIcon = new ImageIcon(getClass().getResource("imagemGuardaRoupa.png"));
        imageGuardaRoupaLabel.setIcon(imageGuardaRoupaIcon);

        listaRoupasGuardaRoupaPanel.setLayout(new BoxLayout(listaRoupasGuardaRoupaPanel, BoxLayout.Y_AXIS));
        qtdRoupasGuardaRoupaLabel.setText("Quantidade de roupas no Guarda-Roupas: " + Main.guardaRoupa.countRoupas());
        corPredGuardaRoupaLabel.setText("Cor predominante no Guarda-Roupas: " + Main.guardaRoupa.getPredCor());

        for (Roupa roupa : Main.guardaRoupa.getRoupas()) {
            listaRoupasLinhaGuardaRoupaTabela.add(new RoupaLinhaGuardaRoupaTabela(roupa, listaRoupasGuardaRoupaPanel, qtdRoupasGuardaRoupaLabel, corPredGuardaRoupaLabel));
            listaRoupasGuardaRoupaPanel.revalidate();
        }

        sairGuardaRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentFrame.dispose();
            }
        });
    }
}
