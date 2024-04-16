import java.util.ArrayList;

public class Pessoa implements BancoDeDados{
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    @Override
    public void salvar(){
        System.out.println("Salvou!");
    }
    public boolean deletar(){
        return true;
    }
    public boolean atualizar(){
        return true;
    }
    public ArrayList<Object> listar(){
        return pessoas;
    }
}
