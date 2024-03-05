package Lista2.Cinema;

public class SessaoCinema {
    String filme;
    String horario;
    int capacidadeTotal;
    int ingressosVendidos;

    public SessaoCinema(String filme, String horario, int capacidadeTotal, int ingressosVendidos) {
    this.filme = filme;
    this.horario = horario;
    this.capacidadeTotal = capacidadeTotal;
    this.ingressosVendidos = ingressosVendidos;
    }
    public String getFilme() {
        return filme;
    }
    public String getHorario() {
        return horario;
    }
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }
    public int getIngressosVendidos() {
        return ingressosVendidos;
    }
    public void setFilme(String filme) {
        this.filme = filme;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    /*void venderIngresso(int ingressos){
        ingressosVendidos += ingressos;
        capacidadeTotal -= ingressosVendidos;       
    }
    void cancelarIngresso(int ingressos){
        ingressosVendidos -= ingressos;
        capacidadeTotal += ingressos;
    }
    void exibirInfoSessao(){
        System.out.println("Filme: "+ filme +
                            "\nHorário: "+ horario +
                            "\nCapacidade restante: "+ capacidadeTotal +
                            "\nIngressos Vendidos: "+ ingressosVendidos);
    }*/

}
