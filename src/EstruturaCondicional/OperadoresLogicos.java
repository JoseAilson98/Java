package EstruturaCondicional;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        //E
        System.out.println(x == y && y <= x);

        //OU
        System.out.println(x == y || y <= x);

        //NAO
        System.out.println( !(x == y) );
    }
}
