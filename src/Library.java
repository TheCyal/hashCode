
import java.util.ArrayList;

public class Library {

    private int numberBooks;
    private int numberDays;
    private ArrayList<Books> books;
    private double ratio;

    public int getNumberBooks() {
        return numberBooks;
    }

    public void setNumberBooks(int numberBooks) {
        this.numberBooks = numberBooks;
    }

    public int getNumberDays() {
        return numberDays;
    }

    public void setNumberDays(int numberDays) {
        this.numberDays = numberDays;
    }

    public int getBooksPerDay() {
        return booksPerDay;
    }

    public void setBooksPerDay(int booksPerDay) {
        this.booksPerDay = booksPerDay;
    }

    private int booksPerDay;

    public Library(int numberBooks, int numberDays, int booksPerDay) {
        this.numberBooks = numberBooks;
        this.numberDays = numberDays;
        this.booksPerDay = booksPerDay;
        this.books = new ArrayList<>();
    }

    public void addBook(Books book){
        this.books.add(book);
    }
    public ArrayList<Books> addBook(){
        return this.books;
    }

    public double getRatio(){
        return this.numberDays/this.books.size();
    }

     public void setRatio(){
        this.ratio = this.getRatio()
    }

    public void getActualRatio(){
        return ratio;
    }
}