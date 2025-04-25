//Objetivo - Cálculo de Perímetro de um Círculo
package lista01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;
        double perimetro = 2 * pi * raio;

        System.out.println("O perímetro do círculo é: " + perimetro);

        sc.close();
    }
}
