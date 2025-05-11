//8) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e
// válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

package lista03;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Estatísticas da Eleição \n");

        System.out.print("Digite o número total de eleitores: ");
        int eleitores = sc.nextInt();

        System.out.print("Digite o números de votos em branco: ");
        int votosBranco = sc.nextInt();

        System.out.print("Digite o número de votos nulos: ");
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
