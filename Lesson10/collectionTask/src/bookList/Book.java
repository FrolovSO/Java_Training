package bookList;

import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private Long costBook;

    public Book(String bookName, String authorName, Long costBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.costBook = costBook;
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

    public Long getCostBook() {
        return costBook;
    }

    public void setCostBook(Long costBook) {
        this.costBook = costBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(costBook, book.costBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, costBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", costBook=" + costBook +
                '}';
    }
}
