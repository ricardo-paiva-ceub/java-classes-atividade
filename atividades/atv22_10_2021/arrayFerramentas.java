// Atividade 01
//Para praticar o conceito de array, crie um programa que declara uma lista (array) capaz de armazenar 10 (dez) nomes de ferramentas para uso de um mecânico. Inicialize cada uma das ferramentas armazenadas no array, em seguida, imprima cada um deles.


public class ListaFerramentas {
    private final String[] arrayListaFerramentas = {"Chave-de-fenda", "Chave Phillips", "Macaco hidráulico", "Porca" , "Parafuso", "Manômetro", "Scanner Automotivo", "Torno", "Multímetro", "Elevador hidráulico"};

    public String[] getArrayListaFerramentas() {
        return arrayListaFerramentas;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Lista de Ferramentas: " + java.util.Arrays.toString(arrayListaFerramentas);
    }

    public static void main(String[] args) {
        ListaFerramentas listaFerramentas = new ListaFerramentas();
        System.out.println(listaFerramentas);
    }
}