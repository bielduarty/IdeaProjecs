//Escreva um programa que calcule o montante final de um investimento
// com base no capital inicial, taxa de juros anual e número de anos.

package lista02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo final de um investimento");

        System.out.println("Digite o Capital inicial (R$): ");
        double capital = sc.nextDouble();

        System.out.println("Digite a taxa de juros anual (%): ");
        double taxaJuros = sc.nextDouble() / 100;
        // adcionei "/ 100" para n criar outra variavel. assim ficara i/100 automaticante

        System.out.println("Digite o numero de anos: ");
        int anos = sc.nextInt();

        double montante = capital * Math.pow(1 + taxaJuros, anos);
        // Math.pow é usado para calcular o valor de um número (a base) elevado a uma potência (o expoente) Base/Expoente

        System.out.printf("Após %d anos, o montante será R$ %.2f%n", anos, montante);
        // %.2f exibe o número com 2 casas decimais, ideal para valores em dinheiro
        // %.2f = duas casas decimais


        sc.close();
    }
}
