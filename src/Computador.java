public class Computador {
    public String marca;
    public String cor;
    public String modelo;
    public String numeroSerie;

    public double preco;

    void imprimir(){
        System.out.println("O computador " + marca + " da cor: "+ cor + " modelo : " + modelo + "nº de série: " + numeroSerie);
        System.out.println("custa R$ " + preco);
    }

    void calculaValor(){
        switch (marca){
            case "HP":
                preco = preco*1.3;
                break;
            case "IBM":
                preco = preco*1.5;
                break;
            default:
                break;
        }
    }

    int alteraValor(double novoValor){
        if(novoValor > 0){
            preco = novoValor;
            return 1;
        }else{
            return 0;
        }
    }


}
