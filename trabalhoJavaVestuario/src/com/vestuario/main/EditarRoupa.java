package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EditarRoupa {

    public JPanel editarRoupaPanel;
    public ArrayList<RoupaLinhaEditarTabela> listaRoupasLinhasEditarTabela = new ArrayList<>();
    private JLabel editarRoupaLabel;
    private JPanel editarRoupaListPanel;
    private JButton retornarTelaPrincipalButton;
    private JPanel imagemEditarPanel;
    private JLabel imagemExcluirRoupa;

    public EditarRoupa(JFrame parentFrame) {
        //        Carregar a imagem da Exclusão de Roupas no JPanel imagemExcluirPanel
        ImageIcon imagemEditarIcon = new ImageIcon(getClass().getResource("imagemRoupasEditar.png"));
        imagemExcluirRoupa.setIcon(imagemEditarIcon);


        editarRoupaListPanel.setLayout(new BoxLayout(editarRoupaListPanel, BoxLayout.Y_AXIS));

//        Popular o JPanel com instâncias de roupas criadas
        for (Roupa roupa : Main.instanciasRoupasCriadas) {
            listaRoupasLinhasEditarTabela.add(new RoupaLinhaEditarTabela(roupa, editarRoupaListPanel, this));
        }

        editarRoupaListPanel.revalidate();
        editarRoupaListPanel.repaint();

        retornarTelaPrincipalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentFrame.dispose();
            }
        });
    }

    public void redesenharPainelRoupas() {
        for (Component componente : editarRoupaListPanel.getComponents()) {
            listaRoupasLinhasEditarTabela.remove(componente);
            editarRoupaListPanel.remove(componente);
            editarRoupaListPanel.revalidate();
        }

        for (Roupa roupa : Main.instanciasRoupasCriadas) {
            listaRoupasLinhasEditarTabela.add(new RoupaLinhaEditarTabela(roupa, editarRoupaListPanel, this));
            editarRoupaListPanel.revalidate();
        }

        editarRoupaListPanel.revalidate();
        editarRoupaListPanel.repaint();
    }
}
