public class Pessoa {
    String nome;
    int idade;
    String cpf;
    boolean ehAluno;
    double altura;

    void comer(String comida){
        System.out.println(nome + " está comendo "+ comida);
        System.out.println();
    }
    void comprar(String produto){
        System.out.println(nome + " está comprando "+ produto);
        System.out.println();
    }
    void fazerExame(String doenca){
        System.out.println(nome + " foi pro médico e descobriu que está com "+ doenca);
        System.out.println();
    }
    void apresentacao(){
        System.out.print("Olá meu nome é "+ nome +", tenho "+ idade +" anos, minha altura é de "+ altura +".");
        
    }
}
