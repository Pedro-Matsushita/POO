public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Início do main");

        try{
        metodo1();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Indice ultrapassado");
        }
    }
    static void metodo1(){
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do main");
    }
    static void metodo2(){
        System.out.println("Inicio do metodo2");
        int[] array = new int[10];
        for(int i = 0; i <= 15; i++){
        
            array[i] = i;
            System.out.println(i);    
        }
        System.out.println("Fim do metodo2");
    }
}
