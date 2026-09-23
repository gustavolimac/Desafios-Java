import java.sql.SQLOutput;
import java.util.Scanner;

/*
7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou
FALSO.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor(true/false): ");
        boolean valor1 = sc.nextBoolean();
        System.out.println("Digite o segundo valor(true/false): ");
        boolean valor2 = sc.nextBoolean();

        if(valor1 && valor2){
            System.out.println("Ambos os valores são verdadeiros");
        }
        else{
            System.out.println("Ambos os valores não são verdadeiros");
        }
        sc.close();
    }
}
