public class principalAcampamento {
    public static void main(String[] args) {
        Acampamento acampamento  = new Acampamento();
        acampamento.nome = "Pedro";
        acampamento.idade = 32;
        acampamento.equipe = "A";

        acampamento.imprimir();
        acampamento.separarGrupo();
        acampamento.imprimir();

    }
}
