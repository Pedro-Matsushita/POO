package Lista2.GerenciadorDeTarefas;

public class Main {
    public static void main(String[] args) {
        Tarefa tf = new Tarefa();
        tf.descricao = "Tarefa de Biologia";
        tf.concluida = false;
        tf.prioridade = 9;
        tf.concluirTarefa();
        tf.exibirTarefa();

        tf.mudarPrioridade(10);
        System.out.println("\nAtividade modificada");
        tf.exibirTarefa();
        
        tf.resetarTarefa();
        System.out.println("\nAtividade resetada");
        tf.exibirTarefa();
    }
    
}
