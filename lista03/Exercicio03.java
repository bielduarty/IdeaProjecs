//3) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.

package lista03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo da Area do retângulo");

        System.out.println("Digite a base do retângulo: ");
        int base = sc.nextInt();

        System.out.println("Digite a altura do retângulo: ");
        int altura = sc.nextInt();

        int formula = base * altura;

        System.out.println("A área do retângulo é " + formula);

    }
}
