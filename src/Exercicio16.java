import java.util.Scanner;

/*
16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e verifique se são
válidos, determine se o triângulo é equilátero, isósceles ou escaleno.
 */
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A do triângulo : ");
        double ladoA = sc.nextDouble();
        System.out.print("Digite o lado B: ");
        double ladoB = sc.nextDouble();
        System.out.print("Digite o lado C: ");
        double ladoC = sc.nextDouble();

        String triangulo = " ";
        if(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            if (ladoA == ladoB && ladoB == ladoC) {
                triangulo = "Triangulo Equilátero";
            } else if (ladoA == ladoB && ladoB != ladoC || ladoA == ladoC && ladoC != ladoB || ladoB == ladoC && ladoC != ladoA) {
                triangulo = "Triangulo isóceles";
            } else if (ladoA != ladoB && ladoB != ladoC) {
                triangulo = "Triangulo escaleno";
            }
        }else {
            triangulo = "invalido";
        }
        System.out.println(triangulo);
    }
}