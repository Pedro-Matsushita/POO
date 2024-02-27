package Lista2.GerenciadorDeCursos;

public class Curso {
    String nome;
    String categoria;
    int cargaHoraria;
    int numeroDeAlunosInscritos;

    Curso(String nome, 
        String categoria, 
        int cargaHoraria, 
        int numeroDeAlunosInscritos){
        this.nome = nome;
        this.categoria = categoria;
        this.cargaHoraria = cargaHoraria;
    }

    void inscreverAluno(int numeroDeAlunosInscritos){
        numeroDeAlunosInscritos += this.numeroDeAlunosInscritos;
    }
    void cancelarInscricao(int numeroDeAlunosInscritos){
        if(numeroDeAlunosInscritos < this.numeroDeAlunosInscritos){
           numeroDeAlunosInscritos -= this.numeroDeAlunosInscritos ;
        }
        else{
            System.out.println("Não há inscritos para cancelar.");
        }
    }
    void atualizarCargaHoraria(int novaCargaHoraria){
        this.cargaHoraria = novaCargaHoraria;
    }
    void exibirInformacoes(){
        System.out.println("\nNome do curso: "+ nome +
                            "\nCategoria do curso: "+ categoria +
                            "\nCarga Horária: "+ cargaHoraria +
                            "\nNúmero de alunos: "+ numeroDeAlunosInscritos);
    }
}
