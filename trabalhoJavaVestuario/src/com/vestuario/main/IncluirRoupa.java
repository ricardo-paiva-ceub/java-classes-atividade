package com.vestuario.main;

import com.vestuario.classes.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IncluirRoupa {
    public JPanel incluirRoupaPanel;
    //    Declarar categoria selecionada
    private String opcaoCategoriaSelecionada;
    //    Definir opções adicionais
    private JLabel labelNovoAdicionado;
    private JComponent componentNovoAdicionado;
    //       Social
    private JLabel tipoMangaLabel;
    private JTextField tipoMangaTextField;
    //       Trabalho
    private JLabel idUniformeLabel;
    private JTextField idUniformeTextField;
    //       Esporte
    private JLabel paraCalorLabel;
    private JCheckBox paraCalorCheckBox;
    //       Esporte Fino
    private JLabel abotoadaLabel;
    private JCheckBox abotoadaCheckBox;
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
    private JButton incluirButton;
    private JButton cancelarButton;
    private JPanel camposTextoPanel;
    private JPanel tituloIncluirPanel;
    private JPanel imagemIncluirPanel;
    private JPanel botoesIncluirPanel;
    private JLabel imagemIncluirLabel;
    private JLabel categoriaRoupaLabel;
    private JComboBox localRoupaComboBox;
    private JComboBox categoriaRoupaComboBox;
    private JPanel opcoesAdicionaisPanel;


    public IncluirRoupa(JFrame parentFrame) {
        //        Carregar a imagem da Inclusão de Roupas no JPanel imagemIncluirPanel
        ImageIcon imagemIncluirIcon = new ImageIcon(getClass().getResource("imagemNovaRoupa.png"));
        imagemIncluirLabel.setIcon(imagemIncluirIcon);

//      Adicionar categorias das roupas no ComboBox
        for (String nomeCategoriaRoupa : Roupa.listaCategorias) {
            categoriaRoupaComboBox.addItem(nomeCategoriaRoupa);
        }

//        Inicializar a variável da opção de categoria selecionada
        opcaoCategoriaSelecionada = String.valueOf(categoriaRoupaComboBox.getSelectedItem());

        //    Configurar opções adicionais
        labelNovoAdicionado = new JLabel();
        componentNovoAdicionado = new JTextField();

        //       Social
        tipoMangaLabel = new JLabel("Tipo de manga");
        tipoMangaTextField = new JTextField();
        tipoMangaTextField.setColumns(15);
        tipoMangaLabel.setHorizontalAlignment(SwingConstants.LEFT);
        tipoMangaTextField.setHorizontalAlignment(SwingConstants.RIGHT);

        //       Trabalho
        idUniformeLabel = new JLabel("ID do Uniforme");
        idUniformeTextField = new JTextField();
        idUniformeTextField.setColumns(15);
        idUniformeLabel.setHorizontalAlignment(SwingConstants.LEFT);
        idUniformeTextField.setHorizontalAlignment(SwingConstants.RIGHT);

        //       Esporte
        paraCalorLabel = new JLabel("Para calor?");
        paraCalorCheckBox = new JCheckBox();
        paraCalorLabel.setHorizontalAlignment(SwingConstants.LEFT);
        paraCalorCheckBox.setHorizontalAlignment(SwingConstants.RIGHT);

        //       EsporteFino
        abotoadaLabel = new JLabel("Abotoada?");
        abotoadaCheckBox = new JCheckBox();
        abotoadaLabel.setHorizontalAlignment(SwingConstants.LEFT);
        abotoadaCheckBox.setHorizontalAlignment(SwingConstants.RIGHT);

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
                    criarNovaRoupa(opcaoCategoriaSelecionada);

//                    Mostrar caixa de diálogo de sucesso
                    JOptionPane.showMessageDialog(null, "Roupa " + Main.instanciasRoupasCriadas.get(Main.instanciasRoupasCriadas.size() - 1).getNome() + " (Categoria " + opcaoCategoriaSelecionada + ")" + " incluída no " + Main.instanciasRoupasCriadas.get(Main.instanciasRoupasCriadas.size() - 1).getLocalRoupa() + ".");

//                   Fechar a janela, após a inclusão com sucesso.
                    parentFrame.dispose();

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

                    JOptionPane.showMessageDialog(incluirRoupaPanel, mensagemErro, "Erro", JOptionPane.ERROR_MESSAGE);
                }

            }

        });

        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentFrame.dispose();
            }
        });
        categoriaRoupaComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                opcaoCategoriaSelecionada = String.valueOf(categoriaRoupaComboBox.getSelectedItem());

                System.out.println(opcaoCategoriaSelecionada);

                switch (opcaoCategoriaSelecionada) {
                    case "Geral":
                        removerDoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);
                        break;

                    case "Social":
                        removerDoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                        labelNovoAdicionado = tipoMangaLabel;
                        componentNovoAdicionado = tipoMangaTextField;

                        adicionarAoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                        break;
                    case "Trabalho":
                        removerDoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                        labelNovoAdicionado = idUniformeLabel;
                        componentNovoAdicionado = idUniformeTextField;

                        adicionarAoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                        break;
                    case "Esporte":
                        removerDoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                        labelNovoAdicionado = paraCalorLabel;
                        componentNovoAdicionado = paraCalorCheckBox;

                        adicionarAoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                        break;
                    case "Esporte Fino":
                        removerDoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                        labelNovoAdicionado = abotoadaLabel;
                        componentNovoAdicionado = abotoadaCheckBox;

                        adicionarAoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                        break;
                }

            }
        });
    }

    public void adicionarAoFrameAdicionais(JComponent label, JComponent componente) {
        opcoesAdicionaisPanel.add(label);
        opcoesAdicionaisPanel.add(componente);
        opcoesAdicionaisPanel.revalidate();
        opcoesAdicionaisPanel.repaint();

        incluirRoupaPanel.revalidate();
        incluirRoupaPanel.repaint();
    }

    public void removerDoFrameAdicionais(JComponent label, JComponent componente) {
        opcoesAdicionaisPanel.remove(label);
        opcoesAdicionaisPanel.remove(componente);
        opcoesAdicionaisPanel.revalidate();
        opcoesAdicionaisPanel.repaint();

        incluirRoupaPanel.revalidate();
        incluirRoupaPanel.repaint();
    }

    public void criarNovaRoupa(String newOpcaoCategoriaSelecionada) {

        switch (newOpcaoCategoriaSelecionada) {
            case "Geral":
                Main.instanciasRoupasCriadas.add(new Roupa(nomeRoupaTextField.getText(), corRoupaTextField.getText(), Integer.parseInt(numManequimTextField.getText()), tecidoRoupaTextField.getText(), Double.parseDouble(precoRoupaTextField.getText()), Main.listaLocaisRoupa.get(String.valueOf(localRoupaComboBox.getSelectedItem()))));
                break;

            case "Social":
                Main.instanciasRoupasCriadas.add(new Social(nomeRoupaTextField.getText(), corRoupaTextField.getText(), Integer.parseInt(numManequimTextField.getText()), tecidoRoupaTextField.getText(), Double.parseDouble(precoRoupaTextField.getText()), Main.listaLocaisRoupa.get(String.valueOf(localRoupaComboBox.getSelectedItem())), tipoMangaTextField.getText()));
                break;
            case "Trabalho":
                Main.instanciasRoupasCriadas.add(new Trabalho(nomeRoupaTextField.getText(), corRoupaTextField.getText(), Integer.parseInt(numManequimTextField.getText()), tecidoRoupaTextField.getText(), Double.parseDouble(precoRoupaTextField.getText()), Main.listaLocaisRoupa.get(String.valueOf(localRoupaComboBox.getSelectedItem())), idUniformeTextField.getText()));
                break;
            case "Esporte":
                Main.instanciasRoupasCriadas.add(new Esporte(nomeRoupaTextField.getText(), corRoupaTextField.getText(), Integer.parseInt(numManequimTextField.getText()), tecidoRoupaTextField.getText(), Double.parseDouble(precoRoupaTextField.getText()), Main.listaLocaisRoupa.get(String.valueOf(localRoupaComboBox.getSelectedItem())), paraCalorCheckBox.isSelected()));
                break;
            case "Esporte Fino":
                Main.instanciasRoupasCriadas.add(new EsporteFino(nomeRoupaTextField.getText(), corRoupaTextField.getText(), Integer.parseInt(numManequimTextField.getText()), tecidoRoupaTextField.getText(), Double.parseDouble(precoRoupaTextField.getText()), Main.listaLocaisRoupa.get(String.valueOf(localRoupaComboBox.getSelectedItem())), abotoadaCheckBox.isSelected()));
                break;
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
