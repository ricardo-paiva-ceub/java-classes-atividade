public class CompostoQuimico {
    private ArrayList<Molecula> moleculaArrayList;
    private String nomeCompostoQuimico;

    public CompostoQuimico(ArrayLista<Molecula> moleculaArrayList, String nomeCompostoQuimico) {
        this.moleculaArrayList = moleculaArrayList;
        this.nomeCompostoQuimico = nomeCompostoQuimico;
    }

    public ArrayLista<Molecula> getMoleculaArrayList() {
        return moleculaArrayList;
    }

    public void setMoleculaArrayList(ArrayLista<Molecula> moleculaArrayList) {
        this.moleculaArrayList = moleculaArrayList;
    }

    public String getNomeCompostoQuimico() {
        return nomeCompostoQuimico;
    }

    public void setNomeCompostoQuimico(String nomeCompostoQuimico) {
        this.nomeCompostoQuimico = nomeCompostoQuimico;
    }
}