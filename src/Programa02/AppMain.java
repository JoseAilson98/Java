package Programa02;

import Programa02.entity.Commente;
import Programa02.entity.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Post post = new Post();
        Commente commente = new Commente("have a nice strip!");
        Commente commente2 = new Commente("have a nice strip!");


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        post.setMoment(LocalDateTime.parse("21/06/2018 13:05:44",formatter));

        post.setTitle("Traveling New Zealand");
        post.setContent("I'm going to visit this wonderfull country");
        post.setLikes(12);

        post.addComments(commente);
        post.addComments(commente2);



        System.out.println(post.getMoment());
        System.out.println(post.getTitle());
        System.out.println(post.getContent());
        System.out.println(post.getLikes());

        for(Commente commente1 : post.getComments()){
            System.out.println(commente1.getText());
        }



    }
}
