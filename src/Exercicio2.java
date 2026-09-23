/*
2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar,
 positivo ou negativo.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if(numero >= 0){
            System.out.println("O número é positivo");
        }
        else{
            System.out.println("O número é negativo");
        }

        if(numero % 2 == 0){
            System.out.print("e par");
        }
        else{
            System.out.print("e impar");
        }
        sc.close();
    }
}
