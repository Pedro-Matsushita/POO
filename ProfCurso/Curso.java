public class Curso {
    private String nome;
    private Professor professor;

    public Curso(String nome){
        this.nome = nome;
        this.professor = null;
    }
    
    public String getCurso(){
        return this.nome;
    }
    public void setCurso(String nome){
        this.nome = nome;
    }

    public Professor getProfessor(){
        return this.professor;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
}
