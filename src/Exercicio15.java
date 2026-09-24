import java.util.Scanner;

/*
15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa
ja viveu. Leve em consideração o ano com 365 dias e o mês com 30 dias.
(Ex: 5 anos, 2 meses e 15 dias de vida)
 */
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.print("Qual o dia nascido: ");
        int dia = sc.nextInt();
        System.out.print("Qual o mês nascido: ");
        int mes = sc.nextInt();
        System.out.print("Qual o ano nascido: ");
        int ano = sc.nextInt();

        int anosVividos = 2026 - ano;
        int mesesVividos = 9 - mes; //Exercicio feito em Setembro dia 23

        int diasVividos;

        if(dia <= 23){
            diasVividos = 23 - dia;
        }
        else{
           diasVividos = 31 + 23 - dia; //O mês de agosto teve 31 dias
        }


        System.out.println("Tempo de vida: " + anosVividos + " anos " + mesesVividos + " meses " + diasVividos + " dias");
        sc.close();
    }
}
