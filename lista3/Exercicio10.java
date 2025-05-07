//10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
// distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor
// seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e
// escrever o custo final ao consumidor.

package lista03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do custo de fábrica
        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = sc.nextDouble();

        // Cálculo das porcentagens
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        double valorDistribuidor = custoFabrica * percentualDistribuidor;
        double valorImpostos = custoFabrica * percentualImpostos;

        // Cálculo do custo final
        double custoFinal = custoFabrica + valorDistribuidor + valorImpostos;

        // Exibição do resultado
        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);

        sc.close();
    }
}
