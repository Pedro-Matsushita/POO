import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eu sei dividir");
        System.out.println("Informe o primeiro valor: ");
        int x = sc.nextInt();
        System.out.println("Informe o segundo valor: ");
        int y = sc.nextInt();
        double r = (x/y);
        System.out.println("O resultado da soma é " + r);
    }
}
