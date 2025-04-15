package exercicio;

import java.util.Scanner;

public class exemploIF {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        int altura = sc.nextInt();

        if (altura > 1.70) {
            System.out.println("Você tem "+altura+" é uma pessoa alta ");
        } else if (altura == 1.70) {
            System.out.println("Você tem uma altura média");
        } else {
            System.out.println("Você é cotoco(a)!");
        }
        sc.close();
    }
}
