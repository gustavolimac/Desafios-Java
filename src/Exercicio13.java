import java.util.Scanner;

/*
13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor
de idade.
 */
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        System.out.println();

        String faixaEtaria;

        if(idade >= 18){
            faixaEtaria = "Maior de idade";
        }
        else{
            faixaEtaria = "Menor de idade";
        }

        System.out.println("Nome: " + nome);
        System.out.println("Faixa Etária: " + faixaEtaria);

        sc.close();
    }
}
