package lista03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo da Area do Triângulo");
        System.out.println("Digite o valor do Triângulo: ");
        double base = sc.nextDouble();

        System.out.println("Digite o valor da altura do Triângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura / 2;

        System.out.println("O valor da área do Triângulo: " + area + "cm²");

        sc.close();
    }
}
