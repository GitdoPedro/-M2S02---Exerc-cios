import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int qtd = scanner.nextInt();

        for ( int i = 0; i < qtd ; i++){
            numeros.add(scanner.nextInt());
        }

        for ( int i = qtd-1 ; i>= 0 ; i--){
            System.out.println(numeros.get(i));
        }

    }
}
