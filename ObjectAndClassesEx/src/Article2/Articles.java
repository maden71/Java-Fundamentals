package Article2;

public class Articles {
    String[] articles;

    public Articles(String[] articles) {
        this.articles = articles;
    }
    public String getTitle() {
        return this.articles[0];
    }
    public String getContent() {
        return this.articles[1];
    }
    public String getAuthor() {
        return this.articles[2];
    }
}
