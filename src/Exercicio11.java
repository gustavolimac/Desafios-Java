import java.util.Scanner;

/*
 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
 imprima na tela o nome do aluno e se o aluno foi aprovado ou reprovado. Para o aluno ser
 considerado aprovado sua média final deve ser maior ou igual a 7.
 */
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a 1º nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a 2º nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a 3º nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite a 4º nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println();
        System.out.println("Nome do aluno: " + nome);
        if(media >= 7){
            System.out.println("Resultado: Aprovado");
        }
        else{
            System.out.println("Resultado: Reprovado");
        }
    }
}
