public class ex02 {
    public static void main(String[] args) {

        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };

        double []temp = {0,0,0,0} ;

        for (int i = 0 ; i <= 3 ; i++){
            for(int j =  0; j<= 3; j++){
                temp[i] += notas[i][j];
            }
        }
        for(double n : temp) {
            System.out.println(n);
        }

        System.out.println(notas[2][0]);
        System.out.println(notas[3][1]);

    }
}
