public class ex05 {

    public static void maiorEMenor(int[] array){
        int max = -50;
        int min = 100;

        if (array != null){

        for(int i = 0; i< array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
            if (array[i]<min){
                min = array[i];
            }


        }

        if (min != max){
           System.out.println("O maior número do array é: " + max);
            System.out.println("O menor número do array é: " + min);
        }
    }}

    public static void main(String[] args) {

       int[] a = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
       int[] b =  {1};
       int[] c =  {1, -1};
       int[] d =  null;
       int[] e =  {-2,-2,-2,-2};
       int[] f =  {20,10, 30};

       maiorEMenor(a);
       maiorEMenor(b);
       maiorEMenor(c);
       maiorEMenor(d);
       maiorEMenor(e);
       maiorEMenor(f);


    }
}
