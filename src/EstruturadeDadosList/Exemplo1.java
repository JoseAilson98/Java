package EstruturadeDadosList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo1 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); // criando a list

        // adicionando informações na lista
        nomes.add("José");
        nomes.add("Kelly");
        nomes.add("Maria");
        nomes.add("Ailson");
        nomes.add("Airton");
        nomes.add("Meirelhes");
        nomes.add("João");
        nomes.add(2,"rafael"); // na possição 2 vou adicionar o rafael.

        //lendo as informações da lista
        for(String obj: nomes){
            System.out.println(obj);
        }
        System.out.println("======================");

        //ver tamanho da lista
        System.out.println("tamanho da lista: "+nomes.size());
        System.out.println("======================");

        //remover
        System.out.println("Removendo.....");
        nomes.remove("Kelly");
        for(String obj: nomes){
            System.out.println(obj);
        }
        System.out.println("======================");

        // se encontrar vai mostrar a posição. se não  vai -1.
        System.out.println("Procurando....."+ nomes.indexOf("João"));
        System.out.println("======================");



        System.out.println("filtrar elementos..");
        List<String> resultado = nomes.stream().filter( x -> x.charAt(0) == 'J').collect(Collectors.toList());
        for(String obj: resultado){
            System.out.println(obj);
        }


    }
}
