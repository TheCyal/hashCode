import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("a_example.txt");
        Scanner scanner = new Scanner(file);
        Books[] books;
        Library[] libraries;
        int noOfDays;

        while(scanner.hasNext()){
            books = new Books[scanner.nextInt()];
            libraries = new Library[scanner.nextInt()];
            noOfDays = scanner.nextInt();
            for(int i =0; i<books.length;i++){
                books[i] = new Books(scanner.nextInt());
            }
            for(int i = 0; i< libraries.length; i++){
                libraries[i] = new Library(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                for(int j = 0; i<libraries[i].getNumberBooks(); j++){
                    libraries[i].addBook(books[scanner.nextInt()]);
                }
                libraries[i].setRatio()
            }

            libraries

        }
        scanner.close();

        
    }
}
