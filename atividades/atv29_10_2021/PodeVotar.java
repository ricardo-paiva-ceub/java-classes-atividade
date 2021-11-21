public class PodeVotar {
    int idade;
    String name;

    public PodeVotar(int idade, String name) {
        this.idade = idade;
        this.name = name;
    }

    public PodeVotar(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void podeVotar() throws ExcecaoNaoPodeVotar {
        if (this.idade < 18) {
            System.out.println(this.getName() + " tem menos de 18 anos e NÃO pode votar!");
            throw new ExcecaoNaoPodeVotar(this.getName() + " tem menos de 18 anos e NÃO pode votar!");
        } else {
            System.out.println(this.getName() + " tem mais de 18 anos e pode, sim, votar!");
        }

    }
}
