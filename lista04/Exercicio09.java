//9 Verificação de Letra Vogal ou Consoante:
//Escreva um programa que solicite ao usuário uma letra e verifique se ela é uma vogal ou uma consoante.
package lista04;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = sc.next().charAt(0);
        // char é usado para ler apenas uma letra na posição zero

        // Converte para minúsculo para facilitar a comparação
        letra = Character.toLowerCase(letra);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É uma vogal.");
        } else if (Character.isLetter(letra)) {
            System.out.println("É uma consoante.");
        } else {
            System.out.println("Não é uma letra.");
        }

        sc.close();
    }
}