package Articles;

public class Article {
    String title;
    String content;
    String author;



    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void edit(String content) {
        this.content = content;
    }
    public void changeAuthor(String author) {
        this.author = author;
    }
    public void rename(String title) {
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public String getContent(){
        return this.content;
    }
    public String getAuthor(){
        return this.author;
    }
}
