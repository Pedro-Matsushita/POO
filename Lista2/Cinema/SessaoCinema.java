package Lista2.Cinema;

public class SessaoCinema {
    String filme;
    String horario;
    int capacidadeTotal;
    int ingressosVendidos;

    void venderIngresso(int ingressos){
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
    }

}
