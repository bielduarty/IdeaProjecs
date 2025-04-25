// Objetivo resto da divisão com usuario
package lista01;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um valor: ");
        double valor1 = sc.nextDouble();

        System.out.println("outro valor: ");
        double valor2 = sc.nextDouble();

        double resto = valor1 % valor2;

        System.out.println("O resto da divisão " + valor1 + " por " + valor2 + " é de: " + resto);

        sc.close();

    }

}