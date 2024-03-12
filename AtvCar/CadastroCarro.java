import java.util.*;
public class CadastroCarro {
    /*Carro c1 = new Carro("mobi", "fiat", "142141", 2020, "branca");
    Carro c2 = new Carro("cachorro", "jacare", "22222", 1970, "verde");*/
    private ArrayList<Carro> listaCarros;
    
    public CadastroCarro(){
        listaCarros = new ArrayList<Carro>();
    }
    public void inserir(Carro carro){
        listaCarros.add(carro);
    }
    public Carro consultarCarro(String placa){
        for(int i = 0; i < listaCarros.size(); i++){
            if(placa == listaCarros.get(i).getPlaca()){
                return listaCarros.get(i);
            }
        }
        return null;
    }
    public static void exibirLista(ArrayList<Carro> listaCarros) {
        for(int i=0; i<listaCarros.size(); i++){
            listaCarros.get(i).exibirDados();
        }
    }
    public boolean removerCarro(String placa){
        Carro c1 = consultarCarro(placa);

        if(c1 == null){
            return false;
        }
        listaCarros.remove(c1);
        return true;
    }
        
}
