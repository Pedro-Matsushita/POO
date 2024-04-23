import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        // Try: situações de código que pode ocorrer algum erro(exceção).
        
        /*  Catch: trecho de código a ser executado quando uma exceção é capturada,
        substituindo por uma mensagem modificada. */
        
        // Finally: trecho de código a ser executado independente se foi capturada exceção ou não.

        // Caso de exceção: ArrayIndexOutOfBoundsException

        int[] idades = new int[4];
        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 25;
        idades[3] = 30;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um index para o acesso no array: ");
        int index = sc.nextInt();

        try{
            System.out.println("A idade solicitada é " + idades[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index inválido.");
        }


        // Caso de exceção: ArithmeticException

        // int x;
        // int y;
        
        // System.out.println("Digite o numerador: ");
        // x = sc.nextInt();

        // System.out.println("Digite o denominador: ");
        // y = sc.nextInt();

        // try{
        //     System.out.println("O resultado da divisão é "+ x/y);
        // }catch(ArithmeticException e){ 
        //     System.out.println("O denominador não pode ser zero (0).");
        // }finally{
        //     System.out.println("Programa finalizado.");
        // }

        

    }
}
