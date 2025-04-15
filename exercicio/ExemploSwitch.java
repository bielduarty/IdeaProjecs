package exercicio;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Escolha um dos cursos abaixo: ");
        System.out.println("1-Administração");
        System.out.println("2-Pedagogia");
        System.out.println("3-Recursos Humanos");
        System.out.println("4-Sair: ");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Parabens-Você escolheu admnistração");
                break;
            case 2:
                System.out.println("Parabens-Você escolheu pedagogia");
                break;
            case 3:
                System.out.println("Parabens-Você escolheu recursos humanos");
                break;
            case 4:
                System.out.println("Parabensa-Você escolheu a opção sair");
                break;

            default:
                System.out.println("Escolha inválida");
                break;
        }
    }

}
