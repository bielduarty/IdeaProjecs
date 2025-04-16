//Imprima os numeros pares de 1 a 50
package lista11;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Imprima os números pares de 2 a 50.");

        for (int numero = 0; numero < 51; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}