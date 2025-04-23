package lista11;


public class Exercicio07 {
    public static void main(String[] args) {

        int contadora = 0;

        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0) {
                contadora++;
            }
        }
        System.out.println("A quantidade de numeros que são divisiveis por três é : " + contadora);
    }
}