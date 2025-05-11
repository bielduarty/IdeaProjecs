//2) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu sucessor.

package lista03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Programa Sucessor");

        System.out.println("Digite um valor: ");

        int valor = sc.nextInt();
        valor++;

        System.out.println("O valor do sucessor do numero digitado é: " + valor);
        // ou poderia concatenar o texto com "+ (valor + 1));


        sc.close();


    }
}
