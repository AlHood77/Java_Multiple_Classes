import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookCollection;
    private int capacity;


    public Library(int capacity){
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();


    }

    public int countBooks() {
        return this.bookCollection.size();
    }

    public void addBook(Book book1) {
        if (this.countBooks() < this.capacity) {
            this.bookCollection.add(book1);
        }
    }
}
