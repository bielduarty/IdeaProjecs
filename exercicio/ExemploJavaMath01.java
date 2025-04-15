package exercicio;

import java.util.Scanner;

public class ExemploJavaMath01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numero01 = sc.nextInt();

        System.out.println("Digite um valor: ");
        int numero02 = sc.nextInt();

        System.out.println("O maior valor digitado pelo cliente é "+numero01);
        System.out.println("O menor valor digitado pelo cliente é "+numero02);

        sc.close();
    }
}
