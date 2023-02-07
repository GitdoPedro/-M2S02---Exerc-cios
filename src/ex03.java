import java.util.Arrays;

public class ex03 {
    public static void main(String[] args) {
        int[] extrato = {100, -35, -15, -5, 55, -20};
        int soma = 0;

        for (double n : extrato) {
            System.out.println(n);
        }

        System.out.println('\n');
        for (int i = extrato.length-1 ; i >= 0 ; i --){
            soma+=extrato[i];
            System.out.println(extrato[i]);
        }
        System.out.println("Total: " + soma);


        if(soma > 0) {
            System.out.println("Saldo positivo");
        }else if ( soma < 0){
            System.out.println("Saldo negativo");
        }else{
            System.out.println("zerado");
            }


    }
}
