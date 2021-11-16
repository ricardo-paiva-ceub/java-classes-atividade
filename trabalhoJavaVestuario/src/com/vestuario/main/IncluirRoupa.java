package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton incluirButton;
    private JButton cancelarButton;

    public IncluirRoupa(JFrame parentFrame) {

//        Adicionar nomes dos locais das roupas no ComboBox
        for (String nomeLocalRoupa : Main.listaLocaisRoupa.keySet()) {
            localRoupaComboBox.addItem(nomeLocalRoupa);
        }

        incluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensagemErro;

                try {
// Verificar se não há dados em branco
                    if (nomeRoupaTextField.getText().isBlank() || corRoupaTextField.getText().isBlank() || numManequimTextField.getText().isBlank() || tecidoRoupaTextField.getText().isBlank() || precoRoupaTextField.getText().isBlank()) {
                        throw new Exception();
                    }

//                    Tentar ativar o construtor da classe Roupa
                    Main.instanciasRoupasCriadas.add(new Roupa(nomeRoupaTextField.getText(), corRoupaTextField.getText(), Integer.parseInt(numManequimTextField.getText()), tecidoRoupaTextField.getText(), Double.parseDouble(precoRoupaTextField.getText()), Main.listaLocaisRoupa.get(localRoupaComboBox.getSelectedItem())))
                    ;

//                    Mostrar caixa de diálogo de sucesso
                    JOptionPane.showMessageDialog(null, "Roupa " + Main.instanciasRoupasCriadas.get(Main.instanciasRoupasCriadas.size() - 1).getNome() + " incluída no " + Main.instanciasRoupasCriadas.get(Main.instanciasRoupasCriadas.size() - 1).getLocalRoupa());
                } catch (Exception exception) {
                    if (nomeRoupaTextField.getText().isBlank() || corRoupaTextField.getText().isBlank() || numManequimTextField.getText().isBlank() || tecidoRoupaTextField.getText().isBlank() || precoRoupaTextField.getText().isBlank()) {
                        mensagemErro = "Há valores em branco. Favor preencher todos os campos.";
                    } else if (!numManequimTextField.getText().matches("-?\\d+") && !precoRoupaTextField.getText().matches("-?\\d+\\.?\\d*")) {
                        mensagemErro = "O valor do número do manequim deve ser um número inteiro e o preço da roupa deve ser um número decimal. Confira os dados digitados e tente novamente.";
                    } else if (!numManequimTextField.getText().matches("-?\\d+")) {
                        mensagemErro = "O valor do número do manequim deve ser um número inteiro. Confira os dados digitados e tente novamente.";
                    } else if (!precoRoupaTextField.getText().matches("-?\\d+\\.?\\d*")) {
                        mensagemErro = "O valor do preço deve ser um número decimal. Confira os dados digitados e tente novamente.";
                    } else {
                        mensagemErro = "Houve erro na inclusão do item. Confira os dados digitados e tente novamente.";
                    }

                    JOptionPane.showMessageDialog(incluirRoupaPannel, mensagemErro, "Erro", JOptionPane.ERROR_MESSAGE);
                }

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
