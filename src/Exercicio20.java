import java.util.Scanner;

/*
20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.
 */
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tabuada do: ");
        int numero = sc.nextInt();

        System.out.println();
        System.out.println("Tabuada do " + numero + ":");

        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + (numero*i));
        }

    }
}
