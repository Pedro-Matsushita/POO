public class Circulo implements FormaGeometrica{
    private double raio;
    private final double pi = 3.14;

    public Circulo(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return this.raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public double area(){
        return pi*(raio*raio);
    }
    @Override
    public double comprimento(){
        return 2*pi*raio;
    }
    @Override
    public String toString(){
        return "Circulo de raio "+ raio + " metros";
    }
}
