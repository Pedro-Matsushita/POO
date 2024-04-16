import java.util.ArrayList;

public class Veiculo implements BancoDeDados{
    private String km;
    private String cor;

    public Veiculo(String km, String cor){
        this.km = km;
        this.cor = cor;
    }
    public String getKm(){
        return this.km;
    }
    public void setKm(String km){
        this.km = km;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
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
        return veiculos;
    }
}
