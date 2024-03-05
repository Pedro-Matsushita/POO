package Lista2.AgendaTelefonica;

public class Main {
    public static void main(String[] args) {
        Contato at = new Contato("Jetosbaldo", "8700-9624", "jetos@gmail.com");

        at.setTelefone("9784-0231");
        at.setEmail("baldo@gmail.com");

        System.out.println(at.getNome());
        System.out.println(at.getTelefone());
        System.out.println(at.getEmail());    
    }
}