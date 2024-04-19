import java.util.List;
import java.util.ArrayList;
public class CadastroFormas {

    private List<FormaGeometrica> formas;
    
    public CadastroFormas(){
        formas = new ArrayList<>();
    }

    public void addForma(FormaGeometrica fg){
        formas.add(fg);
    }
    public void listarFormas(){
        for(int i = 0;i<formas.size();i++){
            System.out.println(formas.get(i));
        }
    }
    public boolean removerFormas(FormaGeometrica fg){
        if(formas.contains(fg)){
            formas.remove(fg);
            return true;
        }
        return false;
    }
}
