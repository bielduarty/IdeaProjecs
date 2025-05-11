// 7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a
// idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
package lista03;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sua Idade Em Dias\n");
        System.out.print("Quantos anos você tem? ");
        int ano = sc.nextInt();
        System.out.print("Numero mês em que nasceu: ");
        int mes = sc.nextInt();
        System.out.print("Agora informe o dia do seu aniversario: ");
        int dia = sc.nextInt();

        int IdadeEmDias = ano * 365 + mes * 30 + dia;

        System.out.println("Sua idade em dias é: " + IdadeEmDias);

        sc.close();
    }
}
