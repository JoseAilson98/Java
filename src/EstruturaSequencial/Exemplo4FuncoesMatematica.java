package EstruturaSequencial;

public class Exemplo4FuncoesMatematica {
    public static void main(String[] args) {


        /*
        Math.sqrt -> raiz quadrada de
        Math.pow -> resultado elevado
        Math.abs -> valor absoluto
         */

        double x = 3.0;
        double y = 10.0;
        double a,b;

        a = Math.sqrt(x);
        System.out.println(a);

        b = Math.pow(x,y);
        System.out.println(b);


        a = Math.abs(x);
        System.out.println(a);

        b = Math.abs(y);
        System.out.println(b);

    }
}
