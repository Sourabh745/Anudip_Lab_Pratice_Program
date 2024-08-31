// Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object. Create an ArrayList of type Book and store all book objects into collections and display all book details. [Hint:Use advanced for loop to display all Books details]

//Using Encapsulation
public class BooksDetail {
    private String bookId, bookName, authorName;

    public BooksDetail(){
        super();
    }

    public BooksDetail(String bookId, String bookName, String authorName){
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    
}
