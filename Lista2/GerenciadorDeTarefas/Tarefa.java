package Lista2.GerenciadorDeTarefas;

public class Tarefa {
    String descricao;
    boolean concluida;
    int prioridade;

    void concluirTarefa(){
        concluida = true;

    }
    void mudarPrioridade(int novaPrioridade){
        this.prioridade = novaPrioridade;
    }
    void exibirTarefa(){
        if(concluida == true){
        System.out.println("\nAtividades");
        System.out.println("\nDescrição: "+ descricao +
                            "\nSituação: Concluída" +
                            "\nPrioridade: "+ prioridade);
        }
        else{
            System.out.println("\nAtividades");
            System.out.println("\nDescrição: "+ descricao +
                                "\nSituação: Incompleta" +
                                "\nPrioridade: "+ prioridade);
        }
    }
    void resetarTarefa(){
        concluida = false;
    }
}
