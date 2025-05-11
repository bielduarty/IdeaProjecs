//6) Escreva um algoritmo para ler as dimensões de um
// circulo (raio), calcular e escrever a área do circulo.

package lista03;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Área Do Circulo \n");
        System.out.print("Informe o raio do Circulo: ");

        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2); // ou raio * raio

        System.out.printf("\nO valor do Circulo é: %.2f\n", area);
        // printf = Formata o codigo para n aparecer mais q duas casas decimais


        sc.close();
    }
}
