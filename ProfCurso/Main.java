public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Daniel");
        Professor p2 = new Professor("Iago");

        Curso c1 = new Curso("Redes");
        Curso c2 = new Curso("POO");

        // Associando cada objeto de Professor a um objeto de Curso
        p1.adicionarCurso(c1);
        p2.adicionarCurso(c2);

        if(p1.adicionarCurso(c2)==false){
            System.out.println("O curso em questão já foi associado a um professor.");
        }
    }
}
