package aulas.aula125_exercicio2_de_composicao_StringBuilder.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    // O private static final serve para que não sejam criadas novas cópias do objeto
    // a cada instância da classe, usando-se assim uma única cópia para todos
    // os objetos Post instanciados.

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    private final List<Comment> comments = new ArrayList<>(); // Lista já instanciada. Não irá ao Construtor

    public Post() {
    }

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // Não haverá setComment, pois a lista não poderá ser trocada,
    // mas apenas a mesma lista será manipulada. Por isso será
    // adicionado no lugar os métodos addComment e removeComment.
    public void addComment(Comment comment) {
        comments.add(comment);

    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes + " Likes - ");
        sb.append(moment.format(fmt1) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment x : comments) {
            sb.append(x.getText() + "\n");
        }

        return sb.toString();
    }
}
