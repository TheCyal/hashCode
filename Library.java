public class Library {

    private int numberBooks;
    private int numberDays;

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
    }
}