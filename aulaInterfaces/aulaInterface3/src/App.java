public class App {
    public static void main(String[] args) throws Exception {
        CadastroFormas cf = new CadastroFormas();

        FormaGeometrica fg = new Quadrado(4);
        FormaGeometrica fg2 = new Circulo(3);
        FormaGeometrica fg3 = new Circulo(40); // não adicionado na lista.

        cf.addForma(fg);
        cf.addForma(fg2);

        cf.listarFormas();

        if(cf.removerFormas(fg3)== true){ //fg3 não foi adicionado na lista, portanto não será removida.
            System.out.println();
            System.out.println("Forma removida com sucesso!");
            System.out.println();
        } else{
            System.out.println();
            System.out.println("Forma não removida!");
            System.out.println();
        }

        cf.listarFormas();
    }
}
