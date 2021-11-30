package com.vestuario.main;

import com.vestuario.classes.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static JFrame framePrincipal = new JFrame("Gerenciador de roupas");

    private JPanel painelPrincipal;
    private JButton roupasNaLavanderiaButton;
    private JButton roupasNoGuardaButton;
    private JButton cadastrarNovaRoupaButton;
    private JButton excluirRoupaButton;
    private JButton sairAppButton;
    private JButton roupasEmUsoButton;
    public JPanel imagemRoupasPanel;
    public JLabel imagemRoupasLabelMain;
    private JPanel tituloGerenciadorRoupasPanel;
    private JLabel tituloGerenciadorRoupasLabel;

    // Criar variáveis para utilização no programa
    public static ArrayList<Roupa> instanciasRoupasCriadas = new ArrayList<Roupa>();
    public static HashMap<String, LocalRoupa> listaLocaisRoupa = new HashMap<>();

    static LocalRoupa guardaRoupa = new LocalRoupa("Guarda-roupas");
    static LocalRoupa lavanderia = new LocalRoupa("Lavanderia");
    static LocalRoupa emUso = new LocalRoupa("Em Uso");

    //    Conjunto de roupas inicipais de teste
    Roupa sueterAzul = new Roupa("Suéter azul", "Azul", 44, "Algodão peruano", 345.99, guardaRoupa);
    Roupa cardigaVermelho = new Roupa("Cardigã vermelho", "Vermelho", 35, "Lã", 415.45, lavanderia);
    Roupa croppedAzul = new Roupa("Cropped azul", "Amarelo", 69, "Nylon", 98.99, lavanderia);
    Roupa socialArmani = new Social("Camisa social Armani", "Azul", 45, "Algodão", 1522.99, lavanderia, "Longa");
    Esporte esportivaNike = new Esporte("Camiseta Esportiva Nike", "Azul", 35, "Dry-fit", 87.99, guardaRoupa, true);

    public Main() {
        // Colocando a imagem das roupas no JPanel
        ImageIcon imagemRoupasMainIcon = new ImageIcon(getClass().getResource("imagemRoupasMain.png"));

        imagemRoupasLabelMain.setIcon(imagemRoupasMainIcon);
        imagemRoupasPanel.repaint();

//        Colocar o botão de sair na cor rosa
        sairAppButton.setBackground(Color.pink);

//        Impedir o redimensionamento do JFrame principal
        framePrincipal.setResizable(false);

        instanciasRoupasCriadas.add(sueterAzul);
        instanciasRoupasCriadas.add(cardigaVermelho);
        instanciasRoupasCriadas.add(croppedAzul);
        instanciasRoupasCriadas.add(socialArmani);
        instanciasRoupasCriadas.add(esportivaNike);

        listaLocaisRoupa.put("Guarda-roupas", guardaRoupa);
        listaLocaisRoupa.put("Lavanderia", lavanderia);
        listaLocaisRoupa.put("Em Uso", emUso);

        roupasNaLavanderiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameRoupasLavanderia = new JFrame("Lavanderia");
                frameRoupasLavanderia.setContentPane(new RoupasLavanderia(frameRoupasLavanderia).roupasLavanderiaPanel);
                frameRoupasLavanderia.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameRoupasLavanderia.pack();
                frameRoupasLavanderia.setVisible(true);

            }
        });
        roupasNoGuardaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameRoupasGuardaRoupa = new JFrame("Guarda-Roupas");
                frameRoupasGuardaRoupa.setContentPane(new RoupasGuardaRoupa(frameRoupasGuardaRoupa).roupasGuardaRoupaPanel);
                frameRoupasGuardaRoupa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameRoupasGuardaRoupa.pack();
                frameRoupasGuardaRoupa.setVisible(true);
            }
        });

        cadastrarNovaRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameCadastrarRoupa = new JFrame("Incluir roupa");
                frameCadastrarRoupa.setContentPane(new IncluirRoupa(frameCadastrarRoupa).incluirRoupaPanel);
                frameCadastrarRoupa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameCadastrarRoupa.pack();
                frameCadastrarRoupa.setVisible(true);
            }
        });
        excluirRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameExcluirRoupa = new JFrame("Excluir roupa");
                frameExcluirRoupa.setContentPane(new ExcluirRoupa(frameExcluirRoupa).excluirRoupaPanel);
                frameExcluirRoupa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameExcluirRoupa.pack();
                frameExcluirRoupa.setVisible(true);
            }
        });
        sairAppButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                framePrincipal.dispose();
            }
        });
        roupasEmUsoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameRoupasEmUso = new JFrame("Roupas em uso");
                frameRoupasEmUso.setContentPane(new RoupasEmUso(frameRoupasEmUso).roupasEmUsoPanel);
                frameRoupasEmUso.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameRoupasEmUso.pack();
                frameRoupasEmUso.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        framePrincipal.setContentPane(new Main().painelPrincipal);
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.pack();
        framePrincipal.setVisible(true);

    }
}
