// # Atividade 01
// Proceda no NetBeans os passos indicados para a criação do JFrameCalculadora. Execute o programa e verifique se ele está abrindo a janela.
//
// ## Atividade 02
// Proceda no NetBeans os passos indicados para a evolução do JFrameCalculadora. Execute o programa e verifique se ele está abrindo a janela e mostrando os componentes visuais de acordo com o projetado.Execute o programa da calculadora e clique nos botões. Relate se há algum comportamento, como a apresentação dos números clicados no campo texto.Adicione botões para as operações de divisão e de multiplicação.
//
// ## Atividade 03
// Proceda no NetBeans os passos indicados para a evolução do JFrameCalculadora. Execute o programa e verifique se a calculadora está funcionado de acordo com o projetado.
// Adicione botões para as operações de divisão e de multiplicação. Altere o código para que eles funcionem.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    JFrame framePrincipalCalculadora = new JFrame("Calculadora");
    JPanel mainCalculadoraPanel;
    JPanel tituloCalculadoraPanel;
    JPanel resultadoCalculadoraPanel;
    JPanel botoesCalculadoraPanel;
    JPanel botaoSairCalculadoraPanel;
    JTextField areaTextoCalculadora;
    JLabel tituloCalculadoraLabel;
    JLabel operacaoCorrenteLabel;
    JButton botaoAdicionar;
    JButton botaoSubtrair;
    JButton botaoMultiplicar;
    JButton botaoDividir;
    JButton botaoLimpar;
    JButton botaoIgual;
    JButton botaoSair;

    double primeiroOperando;
    double segundoOperando;
    double resultadoOperacao;

    String operacaoSelecionada;

    public Calculadora() {
//        Definindo os componentes da interface gráfica
        framePrincipalCalculadora = new JFrame("Calculadora");
        mainCalculadoraPanel = new JPanel();
        tituloCalculadoraPanel = new JPanel();
        resultadoCalculadoraPanel = new JPanel();
        botoesCalculadoraPanel = new JPanel();
        areaTextoCalculadora = new JTextField();
        botaoAdicionar = new JButton("+");
        botaoSubtrair = new JButton("-");
        botaoMultiplicar = new JButton("*");
        botaoDividir = new JButton("/");
        botaoLimpar = new JButton("C");
        botaoIgual = new JButton("=");
        tituloCalculadoraLabel = new JLabel("Bem-vindo à Calculadora!");
        operacaoCorrenteLabel = new JLabel();
        botaoSairCalculadoraPanel = new JPanel();
        botaoSair = new JButton("Sair da calculadora");

        operacaoSelecionada = "=";

        areaTextoCalculadora.setColumns(10);

        tituloCalculadoraPanel.add(tituloCalculadoraLabel);
        resultadoCalculadoraPanel.add(operacaoCorrenteLabel);
        resultadoCalculadoraPanel.add(areaTextoCalculadora);
        botoesCalculadoraPanel.add(botaoAdicionar);
        botoesCalculadoraPanel.add(botaoSubtrair);
        botoesCalculadoraPanel.add(botaoMultiplicar);
        botoesCalculadoraPanel.add(botaoDividir);
        botoesCalculadoraPanel.add(botaoLimpar);
        botoesCalculadoraPanel.add(botaoIgual);

        botaoSairCalculadoraPanel.add(botaoSair);
        botaoSair.setBackground(Color.PINK);

        mainCalculadoraPanel.setLayout(new BoxLayout(mainCalculadoraPanel, BoxLayout.Y_AXIS));

        mainCalculadoraPanel.add(tituloCalculadoraPanel);
        mainCalculadoraPanel.add(resultadoCalculadoraPanel);
        mainCalculadoraPanel.add(botoesCalculadoraPanel);
        mainCalculadoraPanel.add(botaoSairCalculadoraPanel);

//        Inicializando a interface gráfica na tela
        framePrincipalCalculadora.setResizable(false);
        framePrincipalCalculadora.setContentPane(mainCalculadoraPanel);
        framePrincipalCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipalCalculadora.pack();
        framePrincipalCalculadora.setVisible(true);

//        Definindo ações para os botões
//        Adicionar
        botaoAdicionar.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {
                                                 operacaoSelecionada = "+";

                                                 try {
                                                     primeiroOperando = Double.parseDouble(areaTextoCalculadora.getText());
                                                     operacaoCorrenteLabel.setText(primeiroOperando + " +");

                                                     areaTextoCalculadora.setText("");
                                                     areaTextoCalculadora.grabFocus();

                                                 } catch (NumberFormatException ex) {
                                                     JOptionPane.showMessageDialog(mainCalculadoraPanel, "Entrada incorreta! Digite apenas números inteiros ou decimais no campo!", "Erro", JOptionPane.ERROR_MESSAGE);
                                                 }

                                             }
                                         }

        );

//        Subtrair
        botaoSubtrair.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                operacaoSelecionada = "-";

                                                try {
                                                    primeiroOperando = Double.parseDouble(areaTextoCalculadora.getText());
                                                    operacaoCorrenteLabel.setText(primeiroOperando + " -");

                                                    areaTextoCalculadora.setText("");
                                                    areaTextoCalculadora.grabFocus();

                                                } catch (NumberFormatException ex) {
                                                    JOptionPane.showMessageDialog(mainCalculadoraPanel, "Entrada incorreta! Digite apenas números inteiros ou decimais no campo!", "Erro", JOptionPane.ERROR_MESSAGE);
                                                }

                                            }
                                        }

        );

        //        Multiplicar
        botaoMultiplicar.addActionListener(new ActionListener() {
                                               @Override
                                               public void actionPerformed(ActionEvent e) {
                                                   operacaoSelecionada = "*";

                                                   try {
                                                       primeiroOperando = Double.parseDouble(areaTextoCalculadora.getText());
                                                       operacaoCorrenteLabel.setText(primeiroOperando + " *");

                                                       areaTextoCalculadora.setText("");
                                                       areaTextoCalculadora.grabFocus();

                                                   } catch (NumberFormatException ex) {
                                                       JOptionPane.showMessageDialog(mainCalculadoraPanel, "Entrada incorreta! Digite apenas números inteiros ou decimais no campo!", "Erro", JOptionPane.ERROR_MESSAGE);
                                                   }

                                               }
                                           }

        );

        //        Dividir
        botaoDividir.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               operacaoSelecionada = "/";

                                               try {
                                                   primeiroOperando = Double.parseDouble(areaTextoCalculadora.getText());
                                                   operacaoCorrenteLabel.setText(primeiroOperando + " /");

                                                   areaTextoCalculadora.setText("");
                                                   areaTextoCalculadora.grabFocus();

                                               } catch (NumberFormatException ex) {
                                                   JOptionPane.showMessageDialog(mainCalculadoraPanel, "Entrada incorreta! Digite apenas números inteiros ou decimais no campo!", "Erro", JOptionPane.ERROR_MESSAGE);
                                               }

                                           }
                                       }

        );

        botaoIgual.addActionListener(new ActionListener() {
                                         @Override
                                         public void actionPerformed(ActionEvent e) {

                                             try {
                                                 segundoOperando = Double.parseDouble(areaTextoCalculadora.getText());
                                                 operacaoCorrenteLabel.setText("=");

                                                 switch (operacaoSelecionada) {
                                                     case "+" -> resultadoOperacao = primeiroOperando + segundoOperando;
                                                     case "-" -> resultadoOperacao = primeiroOperando - segundoOperando;
                                                     case "*" -> resultadoOperacao = primeiroOperando * segundoOperando;
                                                     case "/" -> resultadoOperacao = primeiroOperando / segundoOperando;
                                                     case "=" -> resultadoOperacao = segundoOperando;
                                                 }

                                                 operacaoSelecionada = "=";
                                                 primeiroOperando = resultadoOperacao;

                                                 areaTextoCalculadora.setText(Double.toString(resultadoOperacao));
                                                 areaTextoCalculadora.grabFocus();

                                             } catch (Exception ex) {
                                                 JOptionPane.showMessageDialog(mainCalculadoraPanel, "Entrada incorreta! Digite apenas números inteiros ou decimais no campo!", "Erro", JOptionPane.ERROR_MESSAGE);
                                             }

                                         }
                                     }

        );

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primeiroOperando = 0.0;
                segundoOperando = 0.0;
                resultadoOperacao = 0.0;

                operacaoCorrenteLabel.setText("");
                areaTextoCalculadora.setText("");
                areaTextoCalculadora.grabFocus();
            }
        });

        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framePrincipalCalculadora.dispose();
            }
        });

    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
    }

}