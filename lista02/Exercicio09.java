//9º Cálculo de Potência:
//Escreva um programa que solicite ao usuário uma base e um
//expoente e calcule a potência.

package lista02;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de Potência");

        System.out.println("Informe um valor inteiro de base: ");
        int base = sc.nextInt();

        System.out.println("Agora informe um valor inteiro de expoente: ");
        int expoente = sc.nextInt();

        double formula = Math.pow(base, expoente);
        //Math.pow(b, 2) para calcular b²

        System.out.println("A potência de " + base + " elevado a " + expoente + " é: " + formula);


        sc.close();
    }
}
