public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Programador("Neto", 500.2);
        Funcionario f2 = new Gerente("Robson", 2000.6);

        System.out.println(f1);
        f1.aumentaSalario();
        System.out.println(f1);

        System.out.println(f2);
        f2.aumentaSalario();
        System.out.println(f2);


    }
}
