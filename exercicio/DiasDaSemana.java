package exercicio;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero correspondente ao dia da semana: ");
        int diaDaSemana = sc.nextInt();

        if (diaDaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaDaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaDaSemana == 3) {
            System.out.println("Terça");
        } else if (diaDaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaDaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaDaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaDaSemana == 7) {
            System.out.println("Sabado");
        }else {
            System.out.println("Não há dias correspodente");
        }
        sc.close();
    }
}
