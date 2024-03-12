import java.util.ArrayList;

public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private int anolanca;
    private String cor;
    private double velatual;

    public Carro(String modelo, String marca, String placa, int anolanca, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.anolanca = anolanca;
        this.cor = cor;
    }
    public Carro(){}

    public double acelerar(double velatual){
        velatual += 20;
        return velatual;
    }
    public double frear(double velatual){
        velatual -= 20;
        return velatual;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public int getAnolanca(){
        return this.anolanca;
    }
    public void setAnolanca(int anolanca){
        this.anolanca = anolanca;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void exibirDados(){
        System.out.println("Modelo:" + this.modelo +
        "\n Marca: " + this.marca +
        "\n Placa: " + this.placa +
        "\n Ano de Lançamento: " + this.anolanca +
        "\n Cor: " + this.cor);
    }
}
