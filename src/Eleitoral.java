import java.sql.SQLOutput;

public class Eleitoral {
    public String nome;
    public int idade;

    void imprimir(){
        System.out.println("Nome: " + nome + " idade: " + idade);
        verificar();
    }

    void verificar(){
        if (idade < 16){
            System.out.println("Eleitor não pode votar");
        }else if (idade >= 18 && idade <= 65 ){
            System.out.println("Voto obrigário");
        }else{
            System.out.println("Voto facultativo");
        }
    }
}
