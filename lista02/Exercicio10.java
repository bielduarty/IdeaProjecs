//10º Cálculo de Soma de Dígitos:
//Escreva um programa que solicite ao usuário um número inteiro e calcule a soma de seus dígitos.

package lista02;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de Soma de Dígitos");

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();

        int soma = 0;

        int numeroAbsoluto = Math.abs(numero);
        // Math.abs garante que o cálculo funcione tanto para positivos quanto para negativos.

        while (numeroAbsoluto > 0) {
            soma += numeroAbsoluto % 10;
            numeroAbsoluto /= 10;
        }
        //Estrutura de repetição que continua enquanto numeroAbsoluto for maior que 0.

        System.out.println("A soma dos digitos é: " + soma);

        sc.close();
    }

}
