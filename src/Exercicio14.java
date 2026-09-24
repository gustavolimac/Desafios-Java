import java.util.Scanner;
/*
14 - Faça um algoritmo que receba um valor A e B, e troque o valor de A por B e o valor de B por A e imprima na
tela os valores.
 */
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int A = sc.nextInt();
        System.out.print("Digite o valor B: ");
        int B = sc.nextInt();

        int valorAuxiliar = A;

        A = B;
        B = valorAuxiliar;

        System.out.println(A);
        System.out.println(B);
    }
}
