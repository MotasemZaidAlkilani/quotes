package quotes;

public class quote {

    private  String author;
    private  String body;



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    @Override
    public String toString() {
        return "quote{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
