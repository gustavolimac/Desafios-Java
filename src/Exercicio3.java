/*
3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá
somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos
deve-se atribuir o resultado a uma variável C e
imprimir seu valor na tela.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor B: ");
        int B = sc.nextInt();

        int C;

        if(A == B){
            C = A + B;
        }
        else{
            C = A * B;
        }

        System.out.println("Resultado: " + C);

        sc.close();
    }
}
