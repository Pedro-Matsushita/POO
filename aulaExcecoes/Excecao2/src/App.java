import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // int numero;

        // try{
        // numero = sc.nextInt();
        // System.out.println("O número digitado foi: "+ numero);
        // } catch(InputMismatchException e){
        //     System.out.println("Não foi digitado um número inteiro");
        // } finally{
        //     System.out.println("Acabou");
        //     sc.close();
        // }
        OperacoesMatematicas op = new OperacoesMatematicas();
        try{
        System.out.println(op.multiplicacao(-7, 10));
        } catch(NumeroNegativoException e){
            System.out.println("Número inserido é negativo");
        }
    }
}
