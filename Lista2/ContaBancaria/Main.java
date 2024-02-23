package Lista2.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.nomeDoTitular = "Matheus";
        cc.saldo = 1000;
        cc.numeroDaConta = "4151556";
        cc.depositar(50);
        cc.exibirInfo();

        if(cc.sacar(300) == true){
            System.out.println();
            System.out.println("Saque realizado com sucesso!");
            cc.exibirInfo();
        }
        else{
            System.out.println("Saldo insuficiente!!!");
        }
    }
    
}
