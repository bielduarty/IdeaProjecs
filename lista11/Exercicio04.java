//Imprima a tabuada de multiplicação de um número específico fornecido pelo usuario
package lista11;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor para ser multiplicado: ");
        double numero = sc.nextDouble();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            double resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        sc.close();

    }
}
