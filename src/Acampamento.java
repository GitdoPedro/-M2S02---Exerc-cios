public class Acampamento {
    public String nome;
    public String equipe;
    public int idade;

    void imprimir(){
        System.out.println(nome + " pertence a equipe " + equipe + " e tem " + idade + " anos.");
    }

    void separarGrupo(){
        if (idade > 6 && idade <=10){
            equipe = "A";
        }else if (idade > 10 && idade < 20){
            equipe = "B";
        }else{
            equipe = "C";
        }
    }
}
