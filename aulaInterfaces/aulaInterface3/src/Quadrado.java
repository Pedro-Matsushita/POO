public class Quadrado implements FormaGeometrica{
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double area(){
        return lado*lado;
    }
    @Override
    public double comprimento(){
        return lado*4;
    }
    @Override
    public String toString(){
        return "Quadrado de lado "+ lado +" metros";
    }
}
