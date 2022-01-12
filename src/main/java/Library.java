import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity){
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int getBooks() {
        return this.books.size();
    }

    public void add(Book book) {
        if(this.capacity > this.books.size()) {
            this.books.add(book);
        }
        else {
                System.out.printf("Can't add to stock - the Library is full.");
        }
    }


}
