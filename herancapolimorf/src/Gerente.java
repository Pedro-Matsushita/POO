public class Gerente extends Funcionario{

    public Gerente(String nome, double salario){
        super(nome, salario);
    }
    @Override
    public void aumentaSalario(){
        double porcentagem;
        porcentagem = getSalario()*0.2;
        setSalario(getSalario()+porcentagem);
    }
    public String toString(){
        return ("\nNome: "+ getNome() +
                            "\nSalario: "+ getSalario() +
                            "\nFunção: Gerente");
    }
}
