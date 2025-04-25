//Objetivo - Cálculo de Área de um Retângulo com usuario
package lista01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a medida da base do retângulo: ");
        double base = sc.nextDouble();

        System.out.println("Informe a medida da altura do retângulo: ");
        double altura = sc.nextDouble();

        double resultado = base * altura;

        System.out.println("se o retângulo tem " + base + "M² de base e " + altura + "M² de altura a area será de " + resultado + "M²");

        sc.close();
    }
}
