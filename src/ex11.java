/*
Lê 5 nomes e notas de uma turma,
calcula e exibe a média das notas da turma e em seguida
exibe a relação de nomes cuja nota é superior a esta média
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        float soma = 0; float media = 0;
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<Float>  notas = new ArrayList<>();

        for (int i = 0 ; i<3 ; i++){
            nomes.add(scanner.next());
            notas.add(scanner.nextFloat());
            soma += notas.get(i);
        }



        media = soma/3;

        System.out.println("Os seguintes alunos ficaram acima da média: ");
        for (int i = 0 ; i<3 ; i++){
            if (notas.get(i)>= media){
                System.out.println(nomes.get(i));
            }
        }
    }
}
