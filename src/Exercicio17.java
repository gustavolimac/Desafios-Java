import java.util.Scanner;

/*
17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
Imprima na tela as duas temperaturas.
 */

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaF = sc.nextDouble();

        double temperaturaC = (5 * (temperaturaF-32) / 9);

        System.out.println("Temperatura em Fahrenheit: " + temperaturaF);
        System.out.println("Temperatura em Celsius: " + temperaturaC);

        sc.close();
    }
}
