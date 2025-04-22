package lista03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Programa Antecessor");
            System.out.println("Digite um valor :");
            int valor = sc.nextInt();
            int antecessor = valor - 1;
            System.out.println(" O valor antecessor do número digitado é :  " + antecessor);
            sc.close();

    }
}
