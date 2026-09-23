import java.util.Scanner;

/*
5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule
quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo
R$ 1.293,20).
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário minimo: ");
        double salarioMinimo = sc.nextDouble();
        System.out.print("Digite o seu salario: ");
        double salario = sc.nextDouble();


        double recebeSalario = salario / salarioMinimo;

        System.out.printf("Você recebe %.2f salarios minimos", recebeSalario);
    }
}
