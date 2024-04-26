public class OperacoesMatematicas {
    
    public double multiplicacao(double x, double y) throws NumeroNegativoException{
        if(x < 0 || y < 0){
            throw new NumeroNegativoException();
        }
        return x*y;
    }
}
