public class Book {
    private String title;
    private String author;
    private String genre;
//need to be private ENCAPSULATION. That's why you need to do the Getter functions to access these.

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }
}
