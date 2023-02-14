/* Leia um conjunto de números. Exiba este conjunto acompanhado do seu elemento simétrico em relação a sua posição no conjunto. Veja o exemplo:
Entrada: 5, 7, 9, 2
Saída:
5 - 2
7 - 9
9 - 7
2 - 5*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Quantos números: ");
        int qtd = scanner.nextInt();

        for (int i = 0 ; i<qtd ; i++){
            numeros.add(scanner.nextInt());
        }

        for(int i = 0 ; i<qtd ; i++){
            System.out.println(numeros.get(i)+ " - " + numeros.get(qtd-i-1));
        }
    }
}
