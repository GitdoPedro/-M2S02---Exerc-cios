import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/* Leia um conjunto de salários, sendo que para terminar a entrada será
fornecido o valor -1. Após toda a entrada ter sido realizada, leia o valor de um reajuste.
 Em seguida exiba todos os salários já reajustados.*/
public class ex13 {

    public static void main(String[] args) {

        Locale ptBR = new Locale("pt", "BR");
        Scanner scanner = new Scanner(System.in);
        List<Float> salarios = new ArrayList<>();
        float salario = scanner.nextFloat();
        salarios.add(salario);
        while(salario != -1){
            salario = scanner.nextFloat();
            salarios.add(salario);
        }

        float reajuste =  + scanner.nextFloat();

        for (int i = 0; i<salarios.size()-1; i++){
            System.out.println(NumberFormat.getCurrencyInstance(ptBR).format(salarios.get(i))+ " foi reajustado para "+ NumberFormat.getCurrencyInstance(ptBR).format(salarios.get(i)*(1+(reajuste/100))));
        }
    }
}
