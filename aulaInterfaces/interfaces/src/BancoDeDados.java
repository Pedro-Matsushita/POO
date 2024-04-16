import java.util.ArrayList;
public interface BancoDeDados{
    
    public void salvar();
    public boolean deletar();
    public boolean atualizar();
    public ArrayList<Object> listar();
}