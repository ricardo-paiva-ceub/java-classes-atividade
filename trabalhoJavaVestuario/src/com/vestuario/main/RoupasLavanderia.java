package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RoupasLavanderia {
    public JPanel roupasLavanderiaPanel;
    private JPanel listaRoupasLavanderiaPanel;
    private JLabel roupasLavanderiaLabel;
    private JLabel qtdRoupasLavanderiaLabel;
    private JLabel corPredLavanderiaLabel;
    private JButton sairLavanderiaButton;
    private JPanel imagemLavanderiaPanel;
    private JLabel imagemLavanderiaLabel;
    public ArrayList<RoupaLinhaLavanderiaTabela> listaRoupaLinhasLavanderiaTabela = new ArrayList<>();


    public RoupasLavanderia(JFrame parentframe) {
//        Carregar a imagem da Lavanderia no JPanel imagemLavanderiaPanel
        ImageIcon imagemLavanderiaIcon = new ImageIcon(getClass().getResource("imagemLavanderia.png"));
        imagemLavanderiaLabel.setIcon(imagemLavanderiaIcon);

        listaRoupasLavanderiaPanel.setLayout(new BoxLayout(listaRoupasLavanderiaPanel, BoxLayout.Y_AXIS));
        qtdRoupasLavanderiaLabel.setText("Quantidade de roupas na Lavanderia: " + Main.lavanderia.countRoupas());
        corPredLavanderiaLabel.setText("Cor predominante na Lavanderia: " + Main.lavanderia.getPredCor());

        for (Roupa roupa : Main.lavanderia.getRoupas()) {
            listaRoupaLinhasLavanderiaTabela.add(new RoupaLinhaLavanderiaTabela(roupa, listaRoupasLavanderiaPanel, qtdRoupasLavanderiaLabel, corPredLavanderiaLabel));
            listaRoupasLavanderiaPanel.revalidate();
        }
        sairLavanderiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentframe.dispose();
            }
        });
    }


}
