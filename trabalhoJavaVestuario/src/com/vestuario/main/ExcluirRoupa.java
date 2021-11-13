package com.vestuario.main;

import com.vestuario.classes.Roupa;

import javax.swing.*;
import java.util.ArrayList;

public class ExcluirRoupa {
    private JLabel excluirRoupaLabel;
    public JPanel excluirRoupaList;
    public ArrayList<RoupaLinhaTabela> listaRoupasLinhasTabela = new ArrayList<>();

    public ExcluirRoupa() {
        excluirRoupaList.setLayout(new BoxLayout(excluirRoupaList, BoxLayout.Y_AXIS));

        for (Roupa roupa : Main.instanciasRoupasCriadas) {
            listaRoupasLinhasTabela.add(new RoupaLinhaTabela(roupa, excluirRoupaList));
            excluirRoupaList.revalidate();
        }
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
