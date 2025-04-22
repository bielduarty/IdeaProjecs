//7º Cálculo de Raízes de uma Equação Quadrática:
//Escreva um programa que resolva uma equação quadrática (ax^2 + bx + c = 0) e exiba suas raízes.

package lista02;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        //Math.pow(b, 2) para calcular b²

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            // Math.sqrt(x) calcula a raiz quadrada de x
            System.out.printf("As raízes da equação são: x1 = %.2f e x2 %.2f%n", x1, x2);

        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("A equação tem uma única raiz real: x = %.2f%n", x);

        } else {
            System.out.println("A equação não possui raízes reais (Delta negativo).");
        }


        sc.close();
    }
}
