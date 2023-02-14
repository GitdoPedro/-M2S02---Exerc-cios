/*Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a média calculada.
Em seguida, de forma agrupada, exiba o outro conjunto de notas (menores do que a média).*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtd = scanner.nextInt();
        float somaTotal = 0; float media = 0;
        List<Float>  notas = new ArrayList<>();

        for (int i = 0 ; i<qtd ; i++){
            notas.add(scanner.nextFloat());
            somaTotal += notas.get(i);
        }

        media = somaTotal/qtd;

        System.out.println("Media da turma foi: " + media);

        for (int i = 0; i<qtd;i++){
            if (notas.get(i) >= media){
                System.out.println(notas.get(i) + " acima da media");
            }
        }

        for (int i = 0; i<qtd;i++){
            if (notas.get(i) < media){
                System.out.println(notas.get(i) + " abaixo da media");
            }
        }
    }
}
