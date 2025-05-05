package metodos;

public class ExemploMetodo03 {
    public static void exibirDados(String nome, int idade, String CEP) {
        System.out.println("Nome: " + nome);
        System.out.println("A idade é: " + idade);
        System.out.println("O CEP é: " + CEP);
    }

    public static void main(String[] args) {
        exibirDados("Gabriel", 21, "02478000");
    }
}
