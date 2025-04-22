package lista03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = Math.pow(lado,2);
        //Math.pow calcular área de um quadrado, volume de um cubo, crescimento exponencial etc

        System.out.println("A área do quadrado é "+area);

        sc.close();
    }
}
