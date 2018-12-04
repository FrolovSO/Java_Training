import bookList.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Motorcycle Dnepr Instructions","OpozitRu",15l);
        Book book2 = new Book("Motorcycle Ural Instructions","OpozitRu",16l);
        Book book3 = new Book("Motorcycle Java Instructions","Java fakture",9l);
        Book book4 = new Book("Motorcycle IG Instructions","Ifan Ifanof",4l);

        List<Book> arrayBookList = new ArrayList<>();

        arrayBookList.add(book1);
        arrayBookList.add(book2);
        arrayBookList.add(book3);
        arrayBookList.add(book4);


        for (Book bookEntry : arrayBookList){
            System.out.println(bookEntry);
        }
        System.out.println(" ");


        for (Book bookEntry : arrayBookList){
            if (bookEntry.getBookName().equals("Motorcycle Java Instructions")){
                System.out.println(" ");
            } else System.out.println(bookEntry);
        }
        System.out.println(" ");

        Book hashBook1 = new Book("ahashBookName1","hashAuthorName1",11l);
        Book hashBook2 = new Book("ahashBookName2","hashAuthorName2",12l);
        Book hashBook3 = new Book("hashBookName3","hashAuthorName3",13l);
        Book hashBook4 = new Book("hashBookName4","hashAuthorName4",14l);
        Book hashBook5 = new Book("ahashBookName5","hashAuthorName5",15l);
        Book hashBook6 = new Book("hashBookName6","hashAuthorName6",16l);
        Book hashBook7 = new Book("ahashBookName7","hashAuthorName7",17l);
        Book hashBook8 = new Book("hashBookName8","hashAuthorName8",18l);
        Book hashBook9 = new Book("hashBookName9","hashAuthorName9",19l);
        Book hashBook10 = new Book("ahashBookName10","hashAuthorName10",10l);
        Book hashBook11 = new Book("hashBookName11","hashAuthorName11",11l);
        Book hashBook12 = new Book("hashBookName12","hashAuthorName12",12l);
        Book hashBook13 = new Book("hashBookName13","hashAuthorName13",13l);
        Book hashBook14 = new Book("ahashBookName14","hashAuthorName14",14l);
        Book hashBook15 = new Book("ahashBookName6","hashAuthorName6",16l);
        Book hashBook16 = new Book("hashBookName16","hashAuthorName16",16l);
        Book hashBook17 = new Book("hashBookName17","hashAuthorName17",17l);
        Book hashBook18 = new Book("ahashBookName6","hashAuthorName6",16l);
        Book hashBook19 = new Book("hashBookName6","hashAuthorName6",16l);
        Book hashBook20 = new Book("hashBookName10","hashAuthorName10",10l);
        Book hashBook21 = new Book("ahashBookName21","hashAuthorName21",11l);
        Book hashBook22 = new Book("ahashBookName6","hashAuthorName6",16l);
        Book hashBook23 = new Book("ahashBookName6","hashAuthorName6",16l);
        Book hashBook24 = new Book("ahashBookName24","hashAuthorName24",14l);
        Book hashBook25 = new Book("hashBookName6","hashAuthorName6",16l);
        Book hashBook26 = new Book("hashBookName26","hashAuthorName26",16l);

        Set<Book> hashSet = new HashSet<>();

        hashSet.add(hashBook1 );
        hashSet.add(hashBook2 );
        hashSet.add(hashBook3 );
        hashSet.add(hashBook4 );
        hashSet.add(hashBook5 );
        hashSet.add(hashBook6 );
        hashSet.add(hashBook7 );
        hashSet.add(hashBook8 );
        hashSet.add(hashBook9 );
        hashSet.add(hashBook10);
        hashSet.add(hashBook11);
        hashSet.add(hashBook12);
        hashSet.add(hashBook13);
        hashSet.add(hashBook14);
        hashSet.add(hashBook15);
        hashSet.add(hashBook16);
        hashSet.add(hashBook17);
        hashSet.add(hashBook18);
        hashSet.add(hashBook19);
        hashSet.add(hashBook20);
        hashSet.add(hashBook21);
        hashSet.add(hashBook22);
        hashSet.add(hashBook23);
        hashSet.add(hashBook24);
        hashSet.add(hashBook25);
        hashSet.add(hashBook26);



        for (Book arrayHashSet : hashSet){
            if (arrayHashSet.getBookName().equals("ahashBookName6")){
                System.out.println(arrayHashSet);
            }else System.out.println("Not contain");
        }
    }
}

