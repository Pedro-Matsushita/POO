public class NumeroNegativoException extends Exception {
    public NumeroNegativoException(){
        super("O número é negativo");
    }

    public NumeroNegativoException(String mensagem){
        super(mensagem);
    }
}
