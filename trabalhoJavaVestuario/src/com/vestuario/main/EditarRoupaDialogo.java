package com.vestuario.main;

import com.vestuario.classes.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditarRoupaDialogo {
    //    Painel principal
    public JPanel editarDialogoRoupaPanel;
    //    Declarar categoria selecionada
    private String categoriaRoupa;
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

    //    Componentes gerais de interface
    private JPanel tituloEditarPanel;
    private JLabel editarRoupaLabel;
    private JPanel camposTextoPanel;
    private JLabel nomeRoupaLabel;
    private JTextField nomeRoupaTextField;
    private JLabel corRoupaLabel;
    private JTextField corRoupaTextField;
    private JTextField numManequimTextField;
    private JLabel numManequimLabel;
    private JTextField tecidoRoupaTextField;
    private JLabel tecidoRoupaLabel;
    private JLabel precoRoupaLabel;
    private JTextField precoRoupaTextField;
    private JComboBox localRoupaComboBox;
    private JLabel localRoupaLabel;
    private JComboBox categoriaRoupaComboBox;
    private JPanel opcoesAdicionaisPanel;
    private JPanel botoesExcluirPanel;
    private JButton editarButton;
    private JButton cancelarButton;
    private JLabel categoriaRoupaLabel;
    private JLabel categoriaRoupaInfoLabel;


    public EditarRoupaDialogo(JFrame parentFrame, Roupa roupa, EditarRoupa editarRoupaInstanciaJanela) {
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

//        Selecionar a opção referente ao local onde a roupa está
        localRoupaComboBox.setSelectedItem(roupa.getLocalRoupa());

//        Definir a categoria da roupa
        categoriaRoupa = roupa.getCategoriaRoupa();
        categoriaRoupaInfoLabel.setText(categoriaRoupa);

//        Se a categoria da roupa não for geral, mostrar opções adicionais de edição
        if (!categoriaRoupa.equals("Geral")) {
            switch (categoriaRoupa) {
                case "Social":
                    Social roupaSocial = (Social) roupa;

                    labelNovoAdicionado = tipoMangaLabel;
                    componentNovoAdicionado = tipoMangaTextField;

                    tipoMangaTextField.setText(roupaSocial.getTipoManga());

                    adicionarAoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                    break;
                case "Trabalho":
                    Trabalho roupaTrabalho = (Trabalho) roupa;

                    labelNovoAdicionado = idUniformeLabel;
                    componentNovoAdicionado = idUniformeTextField;

                    idUniformeTextField.setText(roupaTrabalho.getIdUniforme());

                    adicionarAoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                    break;
                case "Esporte":
                    Esporte roupaEsporte = (Esporte) roupa;

                    labelNovoAdicionado = paraCalorLabel;
                    componentNovoAdicionado = paraCalorCheckBox;

                    paraCalorCheckBox.setSelected(roupaEsporte.getParaCalor());

                    adicionarAoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                    break;
                case "Esporte Fino":
                    EsporteFino roupaEsporteFino = (EsporteFino) roupa;

                    labelNovoAdicionado = abotoadaLabel;
                    componentNovoAdicionado = abotoadaCheckBox;

                    abotoadaCheckBox.setSelected(roupaEsporteFino.getAbotoada());

                    adicionarAoFrameAdicionais(labelNovoAdicionado, componentNovoAdicionado);

                    break;
            }
        }

//        Preencher os campos com a informação da roupa
        nomeRoupaTextField.setText(roupa.getNome());
        corRoupaTextField.setText(roupa.getCor());
        numManequimTextField.setText(String.valueOf(roupa.getNumManequim()));
        tecidoRoupaTextField.setText(roupa.getTecido());
        precoRoupaTextField.setText(String.valueOf(roupa.getPreco()));

        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensagemErro;

                try {
// Verificar se não há dados em branco
                    if (nomeRoupaTextField.getText().isBlank() || corRoupaTextField.getText().isBlank() || numManequimTextField.getText().isBlank() || tecidoRoupaTextField.getText().isBlank() || precoRoupaTextField.getText().isBlank()) {
                        throw new Exception();
                    }

//                    Tentar ativar o editor da classe Roupa
                    editarRoupa(roupa, categoriaRoupa);

//                    Atualizar o frame pai com a relação das roupas a serem editadas
                    editarRoupaInstanciaJanela.redesenharPainelRoupas();

//                    Mostrar caixa de diálogo de sucesso
                    JOptionPane.showMessageDialog(editarDialogoRoupaPanel, "Roupa " + roupa.getNome() + " (Categoria " + categoriaRoupa + ")" + " alterada com sucesso.");

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
                        mensagemErro = "Houve erro na alteração do item. Confira os dados digitados e tente novamente.";
                    }

                    JOptionPane.showMessageDialog(editarDialogoRoupaPanel, mensagemErro, "Erro", JOptionPane.ERROR_MESSAGE);
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

    public void adicionarAoFrameAdicionais(JComponent label, JComponent componente) {
        opcoesAdicionaisPanel.add(label);
        opcoesAdicionaisPanel.add(componente);
        opcoesAdicionaisPanel.revalidate();
        opcoesAdicionaisPanel.repaint();

        editarDialogoRoupaPanel.revalidate();
        editarDialogoRoupaPanel.repaint();
    }

    public void removerDoFrameAdicionais(JComponent label, JComponent componente) {
        opcoesAdicionaisPanel.remove(label);
        opcoesAdicionaisPanel.remove(componente);
        opcoesAdicionaisPanel.revalidate();
        opcoesAdicionaisPanel.repaint();

        editarDialogoRoupaPanel.revalidate();
        editarDialogoRoupaPanel.repaint();
    }

    public void editarRoupa(Roupa roupa, String categoriaRoupa) {

        roupa.setNome(String.valueOf(nomeRoupaTextField.getText()));
        roupa.setCor(corRoupaTextField.getText());
        roupa.setNumManequim(Integer.parseInt(numManequimTextField.getText()));
        roupa.setTecido(tecidoRoupaTextField.getText());
        roupa.setPreco(Double.parseDouble(precoRoupaTextField.getText()));

        LocalRoupa novoLocalRoupa = roupa.local;

        switch (String.valueOf(localRoupaComboBox.getSelectedItem())) {
            case "Guarda-roupas":
                novoLocalRoupa = Main.guardaRoupa;
                break;
            case "Lavanderia":
                novoLocalRoupa = Main.lavanderia;
                break;
            case "Em Uso":
                novoLocalRoupa = Main.emUso;
                break;
        }

        roupa.setLocalRoupa(novoLocalRoupa);

        switch (categoriaRoupa) {

            case "Social":
                Social roupaSocial = (Social) roupa;
                roupaSocial.setTipoManga(tipoMangaTextField.getText());
                break;
            case "Trabalho":
                Trabalho roupaTrabalho = (Trabalho) roupa;
                roupaTrabalho.setIdUniforme(idUniformeTextField.getText());
                break;
            case "Esporte":
                Esporte roupaEsporte = (Esporte) roupa;
                roupaEsporte.setParaCalor(paraCalorCheckBox.isSelected());
                break;
            case "Esporte Fino":
                EsporteFino roupaEsporteFino = (EsporteFino) roupa;
                roupaEsporteFino.setAbotoada(abotoadaCheckBox.isSelected());
                break;
        }
    }

}