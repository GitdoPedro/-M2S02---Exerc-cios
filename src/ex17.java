/*Faça um programa de consulta de telefones a partir de um nome informado por uma chave de dados:
 leia nomes de pessoas com seus respectivos telefones, sendo a quantidade determinada pelo usuário.
  Em seguida pergunte ao usuário qual o nome que ele deseja consultar o telefone. Após sua resposta,
  exiba o telefone da pessoa procurada.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();
        List<String> telefones = new ArrayList<>();
        System.out.println("Quantas pessoas serão cadastradas?");
        int qtd = scanner.nextInt();

        for(int i = 0; i<qtd ; i++){
            System.out.println("Nome: ");
            pessoas.add(scanner.next());
            System.out.println("Telefone: ");
            telefones.add(scanner.next());

        }

        System.out.println("Digite o nome da pessoal a qual deseja o telefone: ");
        String nome = scanner.next();

        for (int i = 0; i < qtd ; i++){
            if (Objects.equals(nome, pessoas.get(i))){
                System.out.println(telefones.get(i));
            }else{
                System.out.println("Pessoa não cadastrada");
            }

        }




    }
}
