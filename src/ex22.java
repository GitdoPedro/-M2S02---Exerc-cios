public class ex22 {
    public static void main(String[] args) {
        ex21 apolice = new ex21();
        apolice.nomeSegurado = "Pedro";
        apolice.idade = 32;
        apolice.valorPremio = 5000;

        apolice.imprimir();
        apolice.calcularPremioApolice();
        apolice.imprimir();
        apolice.oferecerDesconto("Rio de Janeiro");
        apolice.imprimir();
    }
}
