package exercicio;

public class PorcentagemPontos {
    public static void main(String[] args){

        int pontuacaoMaxima = 500;

        int pontuacaoAtual = 423;

        float porcetagemPontacao = (float) pontuacaoAtual/pontuacaoMaxima*100.0f;

        System.out.println("A pontuação em porcetagem é: " + porcetagemPontacao );
    }
}