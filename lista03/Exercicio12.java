//12) Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e
// escrever o valor correspondente em graus Celsius (baseado na fórmula abaixo): C/5 = (F-32)/9.
package lista03;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        float fahrenheit = sc.nextFloat();

        float grausCelsius = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Esta fazendo %.1f°C\n", grausCelsius);
    }
}
