/*
1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é
mostre se a soma é menor que C.
 */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digita o valor A: ");
        int A = sc.nextInt();
        System.out.print("Digita o valor B: ");
        int B = sc.nextInt();
        System.out.print("Digita o valor C: ");
        int C = sc.nextInt();

        int soma = A + B;

        System.out.println("Soma: " + soma);
        if(soma < C){
            System.out.println("A soma é menor que o valor C");
        }

    }
}