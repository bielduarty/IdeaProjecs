package exercicio;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class ExemploJavaMath03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        float numero01 = sc.nextFloat();
        System.out.println("O valor positivo do numero digitado é: "+Math.abs(numero01 ));

        sc.close();
    }
}
