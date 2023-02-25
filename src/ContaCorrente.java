public class ContaCorrente {
    int conta,agencia;
    double saldo;
    String nomeCliente;

    int sacar(double quantia){
        if (saldo > quantia){
            saldo = saldo - quantia;
            return 1;
        }else{
            return 0;
        }
    }

    void depositar(double quantia){
        saldo+=quantia;
    }

    void imprimir(){
        System.out.println("conta: "+conta);
        System.out.println("agencia: "+agencia);
        System.out.println("saldo: "+saldo);
        System.out.println("nome: "+nomeCliente);
    }

}
