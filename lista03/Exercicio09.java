//9) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o
// percentual de reajuste. Calcular e escrever o valor do novo salário.

package lista03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual: R$ ");
        double salarioAtual = sc.nextDouble();

        System.out.print("Digite o percentual de reajuste (%): ");
        double percentualReajuste = sc.nextDouble();

        double novoSalario = salarioAtual + (salarioAtual * percentualReajuste / 100);

        System.out.printf("O novo salário é: R$ %.2f%n", novoSalario);

        sc.close();
    }
}