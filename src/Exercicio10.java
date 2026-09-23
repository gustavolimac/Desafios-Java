import java.util.Scanner;

/*
10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2)/ 2;

        System.out.println();
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
    }
}
