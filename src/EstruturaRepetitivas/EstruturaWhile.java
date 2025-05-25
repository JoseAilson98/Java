package EstruturaRepetitivas;

public class EstruturaWhile {
    public static void main(String[] args) {

        String opcao = "sim";
        double numero = 10;
        double numero2 = 5;
        double soma;

        while (opcao == "sim" || opcao == "SIM"){
            soma = numero + numero2;
            System.out.println(soma);
            opcao = "nao"; // OBS: colocar uma opção diferente para nao fica no loop infinito.
        }
        System.out.println("Finalizado!");
    }
}
