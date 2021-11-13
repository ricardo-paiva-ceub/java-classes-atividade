package com.vestuario.main;

import com.vestuario.classes.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private JButton qtdDeRoupasNaLavanderiaButton;
    private JPanel painelPrincipal;
    private JButton qtdDeRoupasNoGuardaButton;
    private JButton corPredominanteNoGuardaButton;
    private JButton cadastrarNovaRoupaButton;
    private JButton excluirRoupaButton;

    // Criar variáveis para utilização no programa
    public static ArrayList<Roupa> instanciasRoupasCriadas = new ArrayList<Roupa>();
    public static HashMap<String, LocalRoupa> listaLocaisRoupa = new HashMap<>();

    static LocalRoupa guardaRoupa = new LocalRoupa("Guarda-roupas");
    static LocalRoupa lavanderia = new LocalRoupa("Lavanderia");
    static LocalRoupa emUso = new LocalRoupa("Em Uso");

    Roupa sueterAzul = new Roupa("Suéter azul", "Azul", 44, "Algodão peruano", 345.99, guardaRoupa);
    Roupa cardigaVermelho = new Roupa("Cardigã vermelho", "Vermelho", 35, "Lã", 415.45, lavanderia);
    Roupa croppedAzul = new Roupa("Cropped azul", "Amarelo", 69, "Nylon", 98.99, lavanderia);
    Roupa socialArmani = new Social("Camisa social Armani", "Azul", 45, "Algodão", 1522.99, lavanderia, "Longa");
    Esporte esportivaNike = new Esporte("Camiseta Esportiva Nike", "Azul", 35, "Dry-fit", 87.99, guardaRoupa, true);

    public Main() {
        instanciasRoupasCriadas.add(sueterAzul);
        instanciasRoupasCriadas.add(cardigaVermelho);
        instanciasRoupasCriadas.add(croppedAzul);
        instanciasRoupasCriadas.add(socialArmani);
        instanciasRoupasCriadas.add(esportivaNike);

        listaLocaisRoupa.put("Guarda-roupas", guardaRoupa);
        listaLocaisRoupa.put("Lavanderia", lavanderia);
        listaLocaisRoupa.put("Em Uso", emUso);

        qtdDeRoupasNaLavanderiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Quantidade de roupas na " + lavanderia.getNome() + ": " + lavanderia.countRoupas());
            }
        });
        qtdDeRoupasNoGuardaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Quantidade de roupas no " + guardaRoupa.getNome() + ": " + guardaRoupa.countRoupas());
            }
        });
        corPredominanteNoGuardaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cor mais predominante das roupas no " + guardaRoupa.getNome() + ": " + guardaRoupa.getPredCor());
            }
        });
        cadastrarNovaRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameCadastrarRoupa = new JFrame("Incluir roupa");
                frameCadastrarRoupa.setContentPane(new IncluirRoupa(frameCadastrarRoupa).incluirRoupaPannel);
                frameCadastrarRoupa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameCadastrarRoupa.pack();
                frameCadastrarRoupa.setVisible(true);
            }
        });
        excluirRoupaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameExcluirRoupa = new JFrame("Excluir roupa");
                frameExcluirRoupa.setContentPane(new ExcluirRoupa().excluirRoupaList);
                frameExcluirRoupa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameExcluirRoupa.pack();
                frameExcluirRoupa.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        JFrame framePrincipal = new JFrame("Gerenciador de roupas");
        framePrincipal.setContentPane(new Main().painelPrincipal);
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.pack();
        framePrincipal.setVisible(true);

//        Testes no console


//        esportivaNike.toggleParaCalor();
//        esportivaNike.toggleParaCalor();
//        System.out.println("A roupa " + esportivaNike.getNome() + " é para calor? " + esportivaNike.getParaCalor());
//
//        System.out.println(sueterAzul.getCor());
//        System.out.println(sueterAzul.getLocalRoupa());
//
//        System.out.println("Quantidade de roupas no " + guardaRoupa.getNome() + ": " + guardaRoupa.countRoupas());
//
//
//        sueterAzul.setLocalRoupa(lavanderia);
//        System.out.println("Roupa retirada do Guarda-roupa e posta na Lavanderia.");
//
//        System.out.println("Quantidade de roupas na " + lavanderia.getNome() + ": " + lavanderia.countRoupas());
//        System.out.println("Quantidade de roupas no " + guardaRoupa.getNome() + ": " + guardaRoupa.countRoupas());
//
//        System.out.println("Local onde está o " + sueterAzul.getNome() + ": " + sueterAzul.getLocalRoupa());
//        System.out.println("Local onde está a " + socialArmani.getNome() + ": " + socialArmani.getLocalRoupa());
    }
}
