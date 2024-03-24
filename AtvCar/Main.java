import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CadastroCarro cadastro = new CadastroCarro();

        while (true){
            System.out.println("Menuzinho de cadastro de carros");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Consultar carro");
            System.out.println("3 - Remover carro");
            System.out.println("4 - Listar carros");
            System.out.println("5 - Sair");

            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite os dados do carro:");
                    System.out.println("Marca:");
                    String marca = sc.next();
                    System.out.println("Modelo:");
                    String modelo = sc.next();
                    System.out.println("Ano:");
                    int ano = sc.nextInt();
                    System.out.println("Cor:");
                    String cor = sc.next();
                    System.out.println("Placa:");
                    String placa = sc.next();

                    Carro c1 = new Carro(modelo, marca, placa, ano, cor);
                    cadastro.inserir(c1);

                    break;
                case 2:
                    System.out.println("Digite a placa para consulta:");
                    String placaConsulta = sc.next();
                    Carro carroConsulta = cadastro.consultarCarro(placaConsulta);
                    if (carroConsulta == null){
                        System.out.println("Carro não encontrado");
                    } else {
                        carroConsulta.exibir();
                    }
                    break;
                case 3:
                    System.out.println("Digite a placa para remoção:");
                    String placaRemover = sc.next();
                    boolean retornoRemover = cadastro.removerCarro(placaRemover);
                    if (retornoRemover){
                        System.out.println("Carro removido com sucesso");
                    } else {
                        System.out.println("Carro não encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Lista de todos os carros:");
                    cadastro.listarCarros();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }
    }
}
