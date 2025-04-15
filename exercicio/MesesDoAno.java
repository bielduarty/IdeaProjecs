package exercicio;

import java.util.Scanner;

public class MesesDoAno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero correspondente ao dia da semana: ");
        int diaDaSemana = sc.nextInt();

        if (diaDaSemana == 1) {
            System.out.println("Janeiro");
        } else if (diaDaSemana == 2) {
            System.out.println("Fevereiro");
        } else if (diaDaSemana == 3) {
            System.out.println("Março");
        } else if (diaDaSemana == 4) {
            System.out.println("Abril");
        } else if (diaDaSemana == 5) {
            System.out.println("Maio");
        } else if (diaDaSemana == 6) {
            System.out.println("Junho");
        } else if (diaDaSemana == 7) {
            System.out.println("Julho");
        } else if (diaDaSemana == 8) {
            System.out.println("Agosto");
        } else if (diaDaSemana == 9) {
            System.out.println("Outubro");
        } else if (diaDaSemana == 10) {
            System.out.println("Setembro");
        } else if (diaDaSemana == 11) {
            System.out.println("Novembro");
        } else if (diaDaSemana == 12) {
            System.out.println("Dezembro");
        }else {
            System.out.println("Não há mês correspodente");
        }
        sc.close();
    }
}
