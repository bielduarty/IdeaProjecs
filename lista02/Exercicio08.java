//8º Cálculo de Média de N Números:
//Escreva um programa que solicite ao usuário a
// quantidade de números que ele deseja inserir e calcule a média desses números.

package lista02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de Média de N Números");

        System.out.print("Quantos números deseja inserir: ");
        int n = sc.nextInt();

        double[] numeros = new double[n];
        // [] vetor acumula numeros 
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        double media = soma / n;

        System.out.printf("A média dos %d números é: %.2f%n", n, media);

        sc.close();
    }
}