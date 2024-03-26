import java.util.*;
public class Professor {
    private String nome;
    private ArrayList<Curso> cursos;

    public Professor(String nome){
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean adicionarCurso(Curso curso){
        if(curso.getProfessor() != null){
            return false;
        }
        cursos.add(curso);
        curso.setProfessor(this);
        return true;   
    }
}
