import java.util.Scanner;

public class PrincipalContaCorrente {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

    }
    Scanner scanner = new Scanner(System.in);
    void exceSaque(ContaCorrente conta) {
        System.out.println("Digite um valor pra sacar: ");
        double valor = scanner.nextDouble();
        int saque = conta.sacar(valor);

        if (saque == 1) {
            System.out.println("Saque Realizado");
        }else{
            System.out.println("Saque NÃO realizado");
        }

    }

    void execDeposito(ContaCorrente conta) {
        System.out.println("Digite um valor pra depositar: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
    }

    void execConsulta(ContaCorrente conta){
        conta.imprimir();
    }

    void execCadastrar(ContaCorrente conta){
        System.out.println("Nome:");
        conta.nomeCliente = scanner.next();
        conta.conta = scanner.nextInt();
        conta.agencia= scanner.nextInt();
    }

}
