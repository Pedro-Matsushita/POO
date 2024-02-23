package Lista2.AgendaTelefonica;

public class Contato {
    String nome;
    String telefone;
    String email;
    
    void alterarTelefone(String novoTelefone){
        this.telefone = novoTelefone;
    }
    void alterarEmail(String novoEmail){
        this.email = novoEmail;
    }
    void exibirContato(){
        System.out.println("Nome: "+ nome +
                           "\nTelefone: "+ telefone +
                           "\nEmail: "+ email);
        System.out.println();
    }
    // boolean validarEmail
}
