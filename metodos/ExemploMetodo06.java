//Soma
package metodos;

public class ExemploMetodo06 {
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myN1 = plusMethod(8, 5);
        double myN2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myN1);
        System.out.println("int: " + myN2);
    }
}
