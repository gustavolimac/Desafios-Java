import java.util.Scanner;

/*
21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor. As informações fornecidas serão:
valor da hora aula, número de aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o salário
líquido final.
 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da hora aula do professor: ");
        double valorHora = sc.nextDouble();
        System.out.print("Digite o numero de aulas do mês lecionadas: ");
        int numeroAulas = sc.nextInt();
        System.out.print("Digite o percentual de desconto do INSS: ");
        double percentualINSS = sc.nextDouble();

        double totalAulas = valorHora * numeroAulas;
        double descontoINSS = totalAulas * (percentualINSS /100);
        double salarioTotal =  totalAulas - descontoINSS ;

        System.out.println("O salario liquido do professor será: " + salarioTotal);

        sc.close();
    }
}
