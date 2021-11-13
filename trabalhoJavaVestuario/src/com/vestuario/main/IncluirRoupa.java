package com.vestuario.main;

import com.vestuario.classes.LocalRoupa;
import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IncluirRoupa {
    public JPanel incluirRoupaPannel;
    private JLabel incluirRoupaLabel;
    private JTextField nomeRoupaTextField;
    private JTextField corRoupaTextField;
    private JLabel nomeRoupaLabel;
    private JLabel corRoupaLabel;
    private JTextField numManequimTextField;
    private JLabel numManequimLabel;
    private JTextField tecidoRoupaTextField;
    private JLabel tecidoRoupaLabel;
    private JTextField precoRoupaTextField;
    private JLabel precoRoupaLabel;
    private JLabel localRoupaLabel;
    private JComboBox localRoupaComboBox;
    private JButton Incluir;
    private JButton cancelarButton;

    public IncluirRoupa(JFrame parentFrame) {

        for (String nomeLocalRoupa : Main.listaLocaisRoupa.keySet()) {
            localRoupaComboBox.addItem(nomeLocalRoupa);
        }

        Incluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Main.instanciasRoupasCriadas.add(new Roupa(nomeRoupaTextField.getText(), corRoupaTextField.getText(), Integer.parseInt(numManequimTextField.getText()), tecidoRoupaTextField.getText(), Double.parseDouble(precoRoupaTextField.getText()), Main.listaLocaisRoupa.get(localRoupaComboBox.getSelectedItem())));

                JOptionPane.showMessageDialog(null, "Roupa " + Main.instanciasRoupasCriadas.get(Main.instanciasRoupasCriadas.size() - 1).getNome() + " incluída no " + Main.instanciasRoupasCriadas.get(Main.instanciasRoupasCriadas.size() - 1).getLocalRoupa());

            }

        });
        cancelarButton.addActionListener(new ActionListener() {
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
