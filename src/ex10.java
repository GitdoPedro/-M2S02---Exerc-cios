

public class ex10 {

    public static void ePalindromo(String palavra){
        String palavraInversa = "";
        for (int i = palavra.length() -1 ; i >= 0 ; i--){
            palavraInversa = palavraInversa + palavra.charAt(i);
        }

        if(palavraInversa.toLowerCase().equals(palavra.toLowerCase())){
            System.out.println("É palíndromo");
        }else{
            System.out.println("Não é palíndromo");
        }

    }

    public static void main(String[] args) {

        ePalindromo("Pedro");
    }
}
