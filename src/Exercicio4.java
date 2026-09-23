import java.util.Scanner;

/*
4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Numero: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        sc.close();
    }
}
