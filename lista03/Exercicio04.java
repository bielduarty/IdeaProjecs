//4) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo.

package lista03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo da Area do Triângulo\n");

        System.out.print("Digite a base do Triângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do Triângulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("\nA área do Triângulo é " + area + "cm²");

        sc.close();
    }
}
