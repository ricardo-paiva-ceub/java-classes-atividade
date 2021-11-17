package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExcluirRoupa {
    public JPanel excluirRoupaPanel;
    private JLabel excluirRoupaLabel;
    public JPanel excluirRoupaList;
    private JButton retornarTelaPrincipalButton;
    public ArrayList<RoupaLinhaExcluirTabela> listaRoupasLinhasTabela = new ArrayList<>();

    public ExcluirRoupa(JFrame parentFrame) {
        excluirRoupaList.setLayout(new BoxLayout(excluirRoupaList, BoxLayout.Y_AXIS));

        for (Roupa roupa : Main.instanciasRoupasCriadas) {
            listaRoupasLinhasTabela.add(new RoupaLinhaExcluirTabela(roupa, excluirRoupaList));
            excluirRoupaList.revalidate();
        }

        retornarTelaPrincipalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentFrame.dispose();
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
