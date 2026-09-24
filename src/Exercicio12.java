import java.util.Scanner;

/*
12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do
produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o
cálculo adequado.
Tabela de Código de Condições de Pagamento
 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%
 */
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();
        System.out.println("Formas de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        System.out.println("Digite a forma de pagamento: ");
        int formaPagamento = sc.nextInt();

        double parcelado = 0;

        switch(formaPagamento){
            case 1:
                valorProduto -= valorProduto * 0.15;
                break;
            case 2:
                valorProduto -= valorProduto * 0.10;
            case 3:
                break;
            case 4:
                valorProduto += valorProduto * 0.10;

        }

        System.out.println();
        System.out.println("Valor total a ser pago: " + valorProduto);

        sc.close();
    }
}
