public class ex21 {

    public String nomeSegurado;
    public int idade;
    public double valorPremio;

    void imprimir(){
        System.out.println("O " + nomeSegurado + " tem " + idade + " anos e possui valor premio de R$" + valorPremio );
    }

    void calcularPremioApolice(){
        if (idade >= 18 && idade < 25){
            valorPremio += (valorPremio*20)/100;
        }if (idade >25 && idade <= 36){
            valorPremio+=(valorPremio*15)/100;
        }else{
            valorPremio+=(valorPremio*10)/100;
        }
    }

    void oferecerDesconto(String cidade){
        switch (cidade){
            case "Curitiba":
                valorPremio=valorPremio*0.8;
                break;
            case "Rio de Janeiro":
                valorPremio=valorPremio*0.85;
                break;
            case "São Paulo":
                valorPremio=valorPremio*0.9;
                break;
            case "Belo Horizonte":
                valorPremio=valorPremio*0.95;
                break;
            default:
                break;
        }

    }
}
