package FuncoesString;

public class ExemploString {
    public static void main(String[] args) {

        String nome = "José Ailson";

        //Maiúscula
        nome.toUpperCase(); // JOSÉ AILSON

        //Minúscula
        nome.toLowerCase(); // josé ailson

        //Remover espaços em branco
        nome.trim(); // JoséAilson

        //Recortar
        nome.substring(4); // Ailson

        // Substituir
        nome.replace("A","w"); // José Wilson

        // identificar posição
        nome.indexOf("A"); // 5

    }
}
