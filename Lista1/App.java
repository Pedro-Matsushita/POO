public class App {
    public static void main(String[] args) {
        // Disciplina d1 = new Disciplina();
        // d1.nome = "POO";
        // d1.curso = "SIN";
        // d1.ehEletiva = false;
        // d1.professor = "Iago";
        // d1.semestre = 3;

        // Disciplina d2 = new Disciplina();
        // d2.nome = "PI";
        // d2.curso = "SIN";
        // d2.ehEletiva = false;
        // d2.professor = "Daniel";
        // d2.semestre = 2;
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Arthur";
        p1.idade = 17;
        p1.altura = 1.76;
        p1.cpf = "004200";
        p1.ehAluno = false;
        p1.comer("hamburguer");
        p1.comprar("miojo");
        p1.fazerExame("dengue");
        p1.apresentacao();

        Pessoa p2 = new Pessoa();
        p2.nome = "Mariana";
        p2.idade = 18;
        p2.altura = 1.53;
        p2.cpf = "033654";
        p2.ehAluno = false;
        p2.comer("pizza");
        p2.comprar("macarrão");
        p2.fazerExame("nada");
        p2.apresentacao();
    }
}
