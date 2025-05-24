package EstruturaCondicional;

public class EstruturaSwitchCase {
    public static void main(String[] args) {

        int diaSemana = 2;
        String dia;

        switch (diaSemana){
            case 2:
                dia = "Segunda-feira";
                break;

            case 3:
                dia = "Terça-feira";
                break;

            case 4:
                dia = "Quarta-feira";
                break;

            case 5:
                dia = "Quinta-feira";
                break;

            case 6:
                dia = "Sexta-feira";
                break;

            case 7:
                dia = "Sabado";
                break;

            case  8:
                dia = "Domingo";
                break;

            default:
                dia = "Valor invalido";
                break;
        }
        System.out.println("Hoje é "+ dia);

    }
}
