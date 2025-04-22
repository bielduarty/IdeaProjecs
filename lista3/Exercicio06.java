package lista03;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estatísticas da Eleição");

        System.out.println("Digite o número total de eleitores: ");
        int eleitores = sc.nextInt();

        System.out.println("Digite o números de votos em branco: ");
        int votosBranco = sc.nextInt();

        System.out.println("Digite o número de votos nulos: ");
        int votosNulo = sc.nextInt();

        System.out.println("Digite o números de votos válidos: ");
        int votosValidos = sc.nextInt();

        int votos = votosBranco + votosNulo + votosValidos;

        if (votos == eleitores) {
            double porcentagemBranco = ((double) votosBranco / eleitores) * 100;
            double porcentagemNulo = ((double) votosNulo / eleitores) * 100;
            double porcentagemValido = ((double) votosValidos / eleitores) * 100;

            System.out.println("Votos em branco representam: " + porcentagemBranco + "% dos votos.");
            System.out.println("Votos nulos representam: " + porcentagemNulo + "% dos votos.");
            System.out.println("Votos válidos representam: " + porcentagemValido + "% dos votos.");
        } else {
            System.out.println("Aparentemente, seus dados estão incorretos.");
        }

        sc.close();
    }
}
