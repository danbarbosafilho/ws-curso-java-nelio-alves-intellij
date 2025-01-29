package aulas.aula125_exercicio2_de_composicao_StringBuilder;

import aulas.aula125_exercicio2_de_composicao_StringBuilder.entities.Comment;
import aulas.aula125_exercicio2_de_composicao_StringBuilder.entities.Post;

import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {

        LocalDateTime moment1 = LocalDateTime.parse("2018-06-21T13:05:44");
        LocalDateTime moment2 = LocalDateTime.parse("2018-07-28T23:14:19");

        Post post1 = new Post(moment1, "Traveling to new Zealand",
                "I'm going to visit this wonderful country!",
                12);

        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome!"));

        Post post2 = new Post(moment2, "Good night guys",
                "See you tomorrow", 5);

        post2.addComment(new Comment("Goode night"));
        post2.addComment(new Comment("May the Force be with you"));

        System.out.println(post1);
        System.out.println(post2);
    }
}