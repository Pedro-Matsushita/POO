public class Carro{
    private String modelo;
    private String marca;
    private String placa;
    private int anoLancamento;
    private String cor;
    private double velocidadeAtual;

    public Carro(String modelo, String marca, String placa, 
                int anoLancamento, String cor){
                    this.modelo = modelo;
                    this.marca = marca;
                    this.placa = placa;
                    this.anoLancamento = anoLancamento;
                    this.cor = cor;
    }

    public Carro(){}

    /// .... getters e setters

    public String getPlaca(){
        return this.placa;
    }

    public void exibir(){
        System.out.println(
            this.marca + " " + this.modelo + " " + this.anoLancamento + 
            " " + this.cor + " - Placa: " + this.placa);
    }

}