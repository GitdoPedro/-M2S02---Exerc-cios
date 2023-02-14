/*. Leia dois conjuntos de números com a mesma quantidade.
Exiba a intersecção dos conjuntos, ou seja,
 os números que são repetidos nos dois conjuntos.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex19 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        List<Integer> numeros2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho dos conjuntos de números: ");
        int qtd = scanner.nextInt();

        for (int i = 0 ; i<qtd ; i++){
            System.out.println("Preencha o 1º conjunto: ");
            numeros.add(scanner.nextInt());

        }

        for (int i = 0 ; i<qtd ; i++){
            System.out.println("Preencha o 2º conjunto: ");
            numeros2.add(scanner.nextInt());

        }

        for (int i = 0 ; i<qtd ; i++){
            for(int j = 0; j<qtd ; j++){
                if (numeros.get(i) == numeros2.get(j)){
                    System.out.println(numeros.get(i));
                }
            }
        }
    }
}
