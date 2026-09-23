/*
6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();

        double reajuste = valor + valor * 0.05;

        System.out.println("Valor ajustado: " + reajuste);
    }
}
