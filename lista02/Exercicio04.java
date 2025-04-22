//4º Cálculo de Área e Perímetro de um Triângulo:
//Escreva um programa que solicite ao usuário a base e a altura de um triângulo e calcule sua área e perímetro.

package lista02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de Área e Perímetro de um Triângulo");

        System.out.println("Informe o tamanho da base: ");
        double base = sc.nextDouble();

        System.out.println("Informe o tamanho da altura: ");
        double altura = sc.nextDouble();

        double perimetro = base * altura / 2;
        //double area = perimetro / 2;

        System.out.println("O triangulo tem " + perimetro + "cm² de área");


        sc.close();
    }
}
