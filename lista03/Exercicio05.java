//5) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado.
package lista03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do lado do Quadrado: ");
        double lado = sc.nextDouble();

        double area = Math.pow(lado, 2);
        //Math.pow permite calcular o lado-(valor dele) ao cubo ou seja o numeros vezes ele mesmo

        System.out.println("\nA área do quadrado é " + area);

        sc.close();
    }
}
