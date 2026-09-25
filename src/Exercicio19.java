/*
19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
 */
public class Exercicio19 {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
