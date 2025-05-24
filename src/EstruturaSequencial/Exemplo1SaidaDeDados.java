package EstruturaSequencial;

import java.util.Locale;

public class Exemplo1SaidaDeDados {
    public static void main(String[] args) {

        int y = 32;
        double x = 10.35784;

        System.out.println("Y: "+y);
        System.out.println("X: "+x);

        //controlando numero de casa decimais.
        System.out.printf("Resultado: %.2f%n", x);
        System.out.printf("Resutado: %.4f%n",x);

        //Usar ponto vez da virgula.
        Locale.setDefault(Locale.US);
        System.out.printf("Resultado: %.4f%n",x);

        /*

        TEXTO =  %s
        ponto flutuante = %f
        quebra de linha = %n
        inteiro = %d

         */


    }
}
