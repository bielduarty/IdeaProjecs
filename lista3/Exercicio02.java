package lista03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Programa Sucessor");

        System.out.println("Digite um valor: ");

        int valor = sc.nextInt();
        valor++;
        int sucessor = valor;
        System.out.println("O valor do sucessor do numero digitado é: "+sucessor);
        sc.close();


    }
}
