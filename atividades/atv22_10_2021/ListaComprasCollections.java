// Atividade 03
// Crie um programa que registra uma lista de compras semanais com itens como: arroz, feijão, carne, pão etc. Utilize os três tipos de coleções vistos até aqui: HashSet, ArrayList e HashMap.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListaComprasCollections {
    private HashSet<String> listaComprasHashSet = new HashSet<>();
    private HashMap<String, Double> listaComprasHashMap = new HashMap<>();
    private ArrayList<String> listaComprasArrayList = new ArrayList<>();

    public ListaComprasCollections() {
        listaComprasHashSet.add("Banana");
        listaComprasHashSet.add("Maçã");
        listaComprasHashSet.add("Detergente");
        listaComprasHashSet.add("Aveia");
        listaComprasHashSet.add("Café");

        listaComprasHashMap.put("Aveia", 9.99);
        listaComprasHashMap.put("Café", 13.29);
        listaComprasHashMap.put("Banana", 6.99);
        listaComprasHashMap.put("Água Sanitária", 14.30);
        listaComprasHashMap.put("Amaciante", 8.90);

        listaComprasArrayList.add("Couve");
        listaComprasArrayList.add("Coentro");
        listaComprasArrayList.add("Gengibre");
        listaComprasArrayList.add("Tâmaras");
        listaComprasArrayList.add("Goiaba");
    }

    public HashSet<String> getListaComprasHashSet() {
        return listaComprasHashSet;
    }

    public void addListaComprasHashSet(String listaComprasHashSet) {
        this.listaComprasHashSet.add(listaComprasHashSet);
    }

    public HashMap<String, Double> getListaComprasHashMap() {
        return listaComprasHashMap;
    }

    public void addListaComprasHashMap(String stringItem, double preco) {
        this.listaComprasHashMap.put(stringItem, preco);
    }

    public ArrayList<String> getListaComprasArrayList() {
        return listaComprasArrayList;
    }

    public void addListaComprasArrayList(String stringListaCompras) {
        this.listaComprasArrayList.add(stringListaCompras);
    }

    public static void main(String[] args) {
        ListaComprasCollections listaComprasCollections = new ListaComprasCollections();

        System.out.println("Lista de compras HashSet: " + listaComprasCollections.getListaComprasHashSet());
        System.out.println("Lista de compras HashMap: " + listaComprasCollections.getListaComprasHashMap());
        System.out.println("Lista de compras ArrayList: " + listaComprasCollections.getListaComprasArrayList());
    }
}
