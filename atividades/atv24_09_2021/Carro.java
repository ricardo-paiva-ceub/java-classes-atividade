//## Atividade 01
//Crie no exemplo apresentado outra variável Carro chamada outroCarro.
//Defina valores distintos aos seus atributos através de seus respectivos métodos set e os exiba como foi feito com a variável meuCarro.

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String tipoCombustivel;
    private double capacidadeCombustivel;
    private double potencia;

    public Carro(String marca, String modelo, String cor, String tipoCombustivel, double capacidadeCombustivel, double potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getCapacidadeCombustivel() {
        return capacidadeCombustivel;
    }

    public void setCapacidadeCombustivel(double capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public static void main(String[] args) {
        Carro outroCarro = new Carro("Tesla", "Model S", "Azul", "Elétrico", 100, 1020);

        outroCarro.setCor("Vermelho");
        outroCarro.setTipoCombustivel("Híbrido");
        outroCarro.setCapacidadeCombustivel(200);
        outroCarro.setPotencia(1050);

        System.out.println(outroCarro.getCor());
        System.out.println(outroCarro.getTipoCombustivel());
        System.out.println(outroCarro.getCapacidadeCombustivel());
        System.out.println(outroCarro.getPotencia());
    }
}