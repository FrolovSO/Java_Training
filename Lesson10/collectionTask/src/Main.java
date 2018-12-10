import bookList.Book;
import bookList.BooksActions;
import bookList.SecondBooksAction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        BooksActions booksActions = new BooksActions();
        booksActions.createBooks();
        booksActions.showAllBooks();
        booksActions.removeRandomBook();
        booksActions.showAllBooks();

        SecondBooksAction secondBooksAction = new SecondBooksAction();
        secondBooksAction.createSecondBooks();
        secondBooksAction.secondAllBooks();
    }

}

