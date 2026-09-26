import java.util.Scanner;

/*
22 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem, sabendo que o carro
faz 12km com um litro. Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média, distância
percorrida e a quantidade de litros utilizados para fazer a viagem.
Fórmula: distância = tempo x velocidade.
litros usados = distância / 12.
 */
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto tempo será gasto na viagem(em horas): ");
        double tempo = sc.nextDouble();
        System.out.print("Qual será a velocidade média da viagem(em km/h): ");
        double velocidadeMedia = sc.nextDouble();

        double distancia = tempo * velocidadeMedia;
        double litrosUsados = distancia / 12;

        System.out.println("A distancia da viagem foi de " + distancia + "km");
        System.out.println("Foi usado " + litrosUsados + "L de combustível");

        sc.close();
    }
}
