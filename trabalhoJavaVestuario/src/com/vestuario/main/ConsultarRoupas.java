package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ConsultarRoupas {
    public JPanel consutarRoupasMainPanel;
    private JPanel consultarRoupasSairPanel;
    private JButton sairConsultarRoupasButton;
    private JScrollPane consultarRoupasTabelaScrollPane;
    private JPanel consultarRoupasTabelaPanel;
    private JPanel consultarRoupaTituloPanel;
    private JLabel consultarRoupaTituloLabel;
    private JPanel numTotalRoupasPanel;
    private JLabel numTotalRoupasLabel;
    private JTable consultarRoupasTable;

    public ConsultarRoupas(JFrame parentFrame) {
        //        Popular a JTable com instâncias de roupas criadas
        String[] colunasTabela = { "Nome", "Cor", "Num manequim", "Tecido", "Preço", "Categoria", "Local" };
        String[][] dadosTabela = new String[Main.instanciasRoupasCriadas.size()][colunasTabela.length];

        for (int i = 0; i < dadosTabela.length; i++) {
            dadosTabela[i][0] = Main.instanciasRoupasCriadas.get(i).getNome();
            dadosTabela[i][1] = Main.instanciasRoupasCriadas.get(i).getCor();
            dadosTabela[i][2] = String.valueOf(Main.instanciasRoupasCriadas.get(i).getNumManequim());
            dadosTabela[i][3] = Main.instanciasRoupasCriadas.get(i).getTecido();
            dadosTabela[i][4] = String.valueOf(Main.instanciasRoupasCriadas.get(i).getPreco());
            dadosTabela[i][5] = Main.instanciasRoupasCriadas.get(i).getCategoriaRoupa();
            dadosTabela[i][6] = Main.instanciasRoupasCriadas.get(i).getLocalRoupa();
        }

        numTotalRoupasLabel.setText("Quantidade total de roupas: " + Main.instanciasRoupasCriadas.size());

//        Configurar a JTable na GUI
        consultarRoupasTable = new JTable(dadosTabela, colunasTabela);
        consultarRoupasTabelaScrollPane = new JScrollPane(consultarRoupasTable);
        consultarRoupasTable.setPreferredSize(new Dimension(700, 400));
        consultarRoupasTable.setPreferredScrollableViewportSize(consultarRoupasTable.getPreferredSize());
        consultarRoupasTable.setFillsViewportHeight(true);

        consultarRoupasTabelaPanel.add(consultarRoupasTabelaScrollPane);
        consultarRoupasTabelaPanel.revalidate();

        sairConsultarRoupasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentFrame.dispose();
            }
        });
    }
}
