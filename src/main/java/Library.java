import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int booksCount(){
        return this.books.size();
    }

    public void addBook(Book book){
        if (this.capacity > this.books.size())
        this.books.add(book);
    }

    public void loanBook(Book book, Borrower borrower) {
        // check if book in book collection
        if(this.books.contains(book)){
            // if it is, remove book from collection
            this.books.remove(book);

            // add to borrower
            borrower.addBook(book);
        }
    }

}

//Add a capacity to the library and write a method to check if stock is full before adding a book.