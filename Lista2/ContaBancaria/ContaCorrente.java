package Lista2.ContaBancaria;

public class ContaCorrente {
    String numeroDaConta;
    double saldo;
    String nomeDoTitular;

    void depositar(double valor){
        saldo += valor;
    }
    boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }
    void exibirInfo(){
        System.out.println("Nome: "+ nomeDoTitular +
                            "\nSaldo: "+ saldo +
                            "\nNº da conta: "+ numeroDaConta);
    }
    
}
