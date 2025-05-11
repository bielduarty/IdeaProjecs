//13) Faça um algoritmo que leia três notas de um aluno, calcule e escreva a
// média final deste aluno. Considerar que a média é ponderada e que o peso das
// notas é 2, 3 e 5. Fórmula para o cálculo da média final é:
// mediafinal = (n1 * 2 + n2 * 3 + n3 * 5)/10
package lista03;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.print("Informe a segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.print("Informe a terceira nota: ");
        float n3 = sc.nextFloat();

        float mediaFinal = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

        System.out.printf("A media ponderada é %.1f\n", mediaFinal);
    }
}
