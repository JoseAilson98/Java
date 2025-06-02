package VetoresExemplos;

import java.util.Scanner;

public class Vetores03ForEach {
    public static void main(String[] args) {




        String [] vetor = new String[] {"jose","Maria","Kelly"};

        // mostrando os nomes digitados pelo for normal....
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println("---------------------");

        // usando forEach
        for (String obj : vetor){
            System.out.println(obj);
        }



    }
}
