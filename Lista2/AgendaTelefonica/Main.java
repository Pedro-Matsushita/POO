package Lista2.AgendaTelefonica;

public class Main {
    public static void main(String[] args) {
        Contato at = new Contato();
        System.out.println("Contato antigo");
        at.nome = "Claudio";
        at.telefone = "96482-3301";
        at.email = "claudiotek@gmail.com";
        at.exibirContato();

        System.out.println("Contato novo");
        at.alterarTelefone("96770-8479");
        at.alterarEmail("claudiotecno@gmail.com");
        at.exibirContato();
    }
    
}
