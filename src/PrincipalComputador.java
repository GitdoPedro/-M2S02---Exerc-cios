public class PrincipalComputador {
    public static void main(String[] args) {
        Computador computador = new Computador();
        computador.marca = "HP";
        computador.cor = "preto";
        computador.modelo  = "AFX";
        computador.numeroSerie = "20232321";
        computador.preco = 1000;

        computador.imprimir();
        computador.calculaValor();
        computador.imprimir();

        Computador pc = new Computador();
        pc.marca = "IBM";
        pc.cor = "branco";
        pc.modelo = "ASS";
        pc.numeroSerie = "5000";
        pc.preco = 1500;
        int  resposta = pc.alteraValor(1700);
        if (resposta == 1){
            System.out.println("Valor alterado");
        }else{
            System.out.println("Valor NÃO alterado");
        }

        resposta = pc.alteraValor(-1);

        if (resposta == 1){
            System.out.println("Valor alterado");
        }else{
            System.out.println("Valor NÃO alterado");
        }

        pc.imprimir();
    }
}
