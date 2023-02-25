public class PrincipalEstoque {
    public static void main(String[] args) {
        Estoque camisa = new Estoque();
        camisa.nomeProduto = "camisa";
        camisa.quantidade = 10;
        camisa.valor = 40;

        camisa.verificarDisponibilidade();
        camisa.removerProdutos(4);
    }
}
