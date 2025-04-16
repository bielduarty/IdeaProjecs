//Calcule o produto dos numero de 1 a 10
package lista11;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calcule o produto dos números de 1 até 10");


        int numero = 1;

        for (int valor = 1; valor < 11; valor++) {
            numero = valor * numero;

            System.out.println(numero + "*" + valor + "=" + numero * valor);

            sc.close();
        }
    }
}
