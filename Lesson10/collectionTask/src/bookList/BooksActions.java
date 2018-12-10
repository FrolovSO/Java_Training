package bookList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BooksActions {

    private List<Book> arrayBookList;

    public void createBooks() {
        arrayBookList = new ArrayList<>();
        Book book1 = new Book("Motorcycle Dnepr Instructions","OpozitRu",15l);
        Book book2 = new Book("Motorcycle Ural Instructions","OpozitRu",16l);
        Book book3 = new Book("Motorcycle Java Instructions","Java fakture",9l);
        Book book4 = new Book("Motorcycle IG Instructions","Ifan Ifanof",4l);
        arrayBookList.add(book1);
        arrayBookList.add(book2);
        arrayBookList.add(book3);
        arrayBookList.add(book4);
    }

    public void showAllBooks() {
        for (Book bookEntry : arrayBookList){
            System.out.println(bookEntry);
        }
        System.out.println(" ");
    }

    public void removeRandomBook() {
        Random random = new Random();
        int randomInt = random.nextInt(4);
        System.out.println(randomInt);
        arrayBookList.remove(randomInt);
    }
}
