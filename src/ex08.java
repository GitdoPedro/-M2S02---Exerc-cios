/*Localize na lista abaixo e imprima no console a primeira ocorrência de número maior que 50.

List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);*/

import java.util.Arrays;
import java.util.List;

public class ex08 {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

        int i = 0;

        while( i < numeros.size()){
            if (numeros.get(i) > 50){
                System.out.println(numeros.get(i));
                break;
            }
            i+=1;
        }

    }
}
