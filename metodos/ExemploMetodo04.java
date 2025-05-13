package metodos;

public class ExemploMetodo04 {
    public static void exibirComputador(String marcaComputador, String modeloComputador, float precoComputador) {
        System.out.println("A marca do computador é: " + marcaComputador);
        System.out.println("O modelo do computador é: " + modeloComputador);
        System.out.println("O preço do computador é: " + precoComputador);
    }

    public static void main(String[] args) {
        exibirComputador("Samsung", "PX01", 2999.99f);
    }
}