package exercicio;

public class ExemploFor {
    public static void main(String[] args) {

        for (int contadora = 1; contadora < 11; contadora++) {

            for (int contadora01 = 1; contadora < 20; contadora01++) {

                //contadora01++ incrementa mais um na contadora01 e se torna contadora02 e assim por diante
                System.out.println("Contadora: " + contadora + "-" + "Contadora01:" + contadora01);

            }

        }
    }
}
//inicialização: int i = 0 (começa com 0)
//condição: i < 5 (o loop continuará enquanto i for menor que 5).
//incremento: i++ (a cada interação, i aumenta em 1).