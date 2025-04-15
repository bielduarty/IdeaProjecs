package lista07;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int contadora = 0;
        /*Apresentar os resultados de uma tabuada de multiplicar
        (de 1 até 10) de um numero qualquer. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber a tabuada ate o 10");
        int numero = sc.nextInt();

        while (contadora <= 10) {
            System.out.println(numero + "X" + contadora + "=" + (numero * contadora));
            contadora++;
        }
        sc.close();
    }
}
