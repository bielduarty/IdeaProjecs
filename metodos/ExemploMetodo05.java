package metodos;

public class ExemploMetodo05 {
    public static void verificarIdade(int idade) {
        if (idade < 18) {
            System.out.println("Menor de idade, acesso negado");
        } else {
            System.out.println("Maior de idade, acesso liberado");
        }
    }

    public static void main(String[] args) {
        verificarIdade(17);
    }
}
