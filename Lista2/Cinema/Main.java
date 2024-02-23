package Lista2.Cinema;

public class Main {
    public static void main(String[] args) {
        SessaoCinema sc = new SessaoCinema();
        sc.filme = "O Senhor dos Anéis";
        sc.horario = "13:30h";
        sc.capacidadeTotal = 100;
        sc.ingressosVendidos = 50;
        sc.venderIngresso(11);
        sc.cancelarIngresso(22);
        sc.exibirInfoSessao();

    }
}
