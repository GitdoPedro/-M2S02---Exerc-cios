/*7. Faça um programa de consulta pela posição numérica da pessoa: leia nomes de pessoas, sendo a quantidade determinada pelo usuário. Logo após a entrada pergunte ao usuário o número do nome que ele gostaria de consultar. Após sua resposta, exiba o nome que fica na posição informada.

Chame atenção do usuário em caso de uma consulta inválida, ou seja, com números menores ou iguais a zero, ou maiores do que a quantidade cadastrada.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();
        System.out.println("Quantas pessoas serão cadastradas?");
        int qtd = scanner.nextInt();

        for(int i = 0; i<qtd ; i++){
            pessoas.add(scanner.next());
        }

        System.out.println("Digite o número da pessoa desejada: ");
        int numero = scanner.nextInt();
        if (numero < qtd || numero < 1) {
            System.out.println("Posição inexistente");
        }else{
            System.out.println(pessoas.get(numero - 1));
        }

    }
}
