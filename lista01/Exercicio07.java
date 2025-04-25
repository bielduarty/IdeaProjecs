//Objetivo - calculo da media aritimetica com usuario
package lista01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe três valores inteiros ");

        System.out.println("Primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Segundo valor: ");
        int valor2 = sc.nextInt();

        System.out.println("Terceiro valor: ");
        int valor3 = sc.nextInt();

        int resultado = (valor1 + valor2 + valor3) / 3;

        System.out.println("O calculo da media aritimetica desses três valores é "+resultado);

        sc.close();
    }
}
