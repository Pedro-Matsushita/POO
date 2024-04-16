import java.util.ArrayList;

public class salaDeAula implements BancoDeDados{
    private int numero;
    private int andar;

    public salaDeAula(int numero, int andar){
        this.numero = numero;
        this.andar = andar;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getAndar(){
        return this.andar;
    }
    public void setAndar(int andar){
        this.andar = andar;
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
        return salas;
    }
}
