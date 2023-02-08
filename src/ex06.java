/*Dado a lista de números:

List<Integer> lista = Arrays.asList(1,2,3,4);

Percorra a lista e gere uma nova com o triplo do valor de cada elemento:*/

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex06 {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> listaTripla = new ArrayList<>();

        for(int i = 0; i < lista.size(); i++)
        {
             listaTripla.add(lista.get(i)*3);
        }

        System.out.println(listaTripla);
    }



}
