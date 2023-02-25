public class Estoque {
    public String nomeProduto;
    public double valor;
    public int quantidade;

    void imprimir(){
        System.out.println("Produto: "+nomeProduto);
        System.out.println("valor: R$ "+valor);
        System.out.println("quantidade: "+quantidade);

    }

    int verificarDisponibilidade(){
        if (quantidade> 0){
            return 1;
        }else{
            return 0;
        }
    }

    int removerProdutos(int qtd){
        if ((verificarDisponibilidade()) == 1 && (qtd <= quantidade)){
            quantidade = quantidade - qtd;
            return 1;
        }return 0;
    }

}
