package Lista2.Cinema;

public class Main {
    public static void main(String[] args) {
        SessaoCinema sc = new SessaoCinema("O Senhor dos Anéis", "13:30h", 100, 50);
        
        System.out.println(sc.getFilme());
        System.out.println(sc.getHorario());
        System.out.println(sc.getCapacidadeTotal());
        System.out.println(sc.getIngressosVendidos());

        sc.setFilme("O Senhor dos Anéis");
        sc.setHorario("14:30");
        /*sc.filme = "O Senhor dos Anéis";
        sc.horario = "13:30h";
        sc.capacidadeTotal = 100;
        sc.ingressosVendidos = 50;
        sc.venderIngresso(11);
        sc.cancelarIngresso(22);
        sc.exibirInfoSessao();

    }*/
}
