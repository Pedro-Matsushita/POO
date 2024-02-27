package Lista2.GerenciadorDeCursos;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("SIN",
        "TI",
        80,
        40);
        
        Curso c2 = new Curso("C3",
        "TI",
        100,
        50);

        c1.exibirInformacoes();
        c1.inscreverAluno(5);
        c1.cancelarInscricao(3);
        c1.atualizarCargaHoraria(120);
        c1.exibirInformacoes();

        c2.exibirInformacoes();
        c2.inscreverAluno(7);
        c2.cancelarInscricao(2);
        c2.atualizarCargaHoraria(130);
        c2.exibirInformacoes();
    }
}
