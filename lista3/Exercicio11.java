//11) Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais
// uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por
// ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o
// valor total de suas vendas, o salário fixo e o valor que ele recebe por
// carro vendido. Calcule e escreva o salário final do vendedor.

package lista03;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = sc.nextDouble();

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = sc.nextInt();

        System.out.print("Digite o valor total das vendas: R$ ");
        double totalVendas = sc.nextDouble();

        System.out.print("Digite o valor recebido por carro vendido: R$ ");
        double comissaoPorCarro = sc.nextDouble();

        // Cálculo da comissão total
        double comissaoFixa = carrosVendidos * comissaoPorCarro;
        double comissaoPercentual = totalVendas * 0.05;

        // Cálculo do salário final
        double salarioFinal = salarioFixo + comissaoFixa + comissaoPercentual;

        // Exibição do resultado
        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);

        sc.close();
    }
}
