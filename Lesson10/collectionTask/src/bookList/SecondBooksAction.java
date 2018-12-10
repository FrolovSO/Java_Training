package bookList;

import java.util.HashSet;
import java.util.Set;

public class SecondBooksAction {
    private Set<Book> secondArrayBookList;

    public void createSecondBooks() {
        secondArrayBookList = new HashSet<>();
        Book secondArrayBookList1 = new Book("ahashBookName1", "hashAuthorName1", 11l);
        Book secondArrayBookList2 = new Book("ahashBookName2", "hashAuthorName2", 12l);
        Book secondArrayBookList3 = new Book("hashBookName3", "hashAuthorName3", 13l);
        Book secondArrayBookList4 = new Book("hashBookName4", "hashAuthorName4", 14l);
        Book secondArrayBookList5 = new Book("ahashBookName5", "hashAuthorName5", 15l);
        Book secondArrayBookList6 = new Book("hashBookName6", "hashAuthorName6", 16l);
        Book secondArrayBookList7 = new Book("ahashBookName7", "hashAuthorName7", 17l);
        Book secondArrayBookList8 = new Book("hashBookName8", "hashAuthorName8", 18l);
        Book secondArrayBookList9 = new Book("hashBookName9", "hashAuthorName9", 19l);
        Book secondArrayBookList10 = new Book("ahashBookName10", "hashAuthorName10", 10l);
        Book secondArrayBookList11 = new Book("hashBookName11", "hashAuthorName11", 11l);
        Book secondArrayBookList12 = new Book("hashBookName12", "hashAuthorName12", 12l);
        Book secondArrayBookList13 = new Book("hashBookName13", "hashAuthorName13", 13l);
        Book secondArrayBookList14 = new Book("ahashBookName14", "hashAuthorName14", 14l);
        Book secondArrayBookList15 = new Book("ahashBookName6", "hashAuthorName6", 16l);
        Book secondArrayBookList16 = new Book("hashBookName16", "hashAuthorName16", 16l);
        Book secondArrayBookList17 = new Book("hashBookName17", "hashAuthorName17", 17l);
        Book secondArrayBookList18 = new Book("ahashBookName6", "hashAuthorName6", 16l);
        Book secondArrayBookList19 = new Book("hashBookName6", "hashAuthorName6", 16l);
        Book secondArrayBookList20 = new Book("hashBookName10", "hashAuthorName10", 10l);
        Book secondArrayBookList21 = new Book("ahashBookName21", "hashAuthorName21", 11l);
        Book secondArrayBookList22 = new Book("ahashBookName6", "hashAuthorName6", 16l);
        Book secondArrayBookList23 = new Book("ahashBookName6", "hashAuthorName6", 16l);
        Book secondArrayBookList24 = new Book("ahashBookName24", "hashAuthorName24", 14l);
        Book secondArrayBookList25 = new Book("hashBookName6", "hashAuthorName6", 16l);
        Book secondArrayBookList26 = new Book("hashBookName26", "hashAuthorName26", 16l);

        secondArrayBookList.add(secondArrayBookList1);
        secondArrayBookList.add(secondArrayBookList2);
        secondArrayBookList.add(secondArrayBookList3);
        secondArrayBookList.add(secondArrayBookList4);
        secondArrayBookList.add(secondArrayBookList5);
        secondArrayBookList.add(secondArrayBookList6);
        secondArrayBookList.add(secondArrayBookList7);
        secondArrayBookList.add(secondArrayBookList8);
        secondArrayBookList.add(secondArrayBookList9);
        secondArrayBookList.add(secondArrayBookList10);
        secondArrayBookList.add(secondArrayBookList11);
        secondArrayBookList.add(secondArrayBookList12);
        secondArrayBookList.add(secondArrayBookList13);
        secondArrayBookList.add(secondArrayBookList14);
        secondArrayBookList.add(secondArrayBookList15);
        secondArrayBookList.add(secondArrayBookList16);
        secondArrayBookList.add(secondArrayBookList17);
        secondArrayBookList.add(secondArrayBookList18);
        secondArrayBookList.add(secondArrayBookList19);
        secondArrayBookList.add(secondArrayBookList20);
        secondArrayBookList.add(secondArrayBookList21);
        secondArrayBookList.add(secondArrayBookList22);
        secondArrayBookList.add(secondArrayBookList23);
        secondArrayBookList.add(secondArrayBookList24);
        secondArrayBookList.add(secondArrayBookList25);
        secondArrayBookList.add(secondArrayBookList26);
    }

    public void secondAllBooks(){
        for (Book arrayHashSet : secondArrayBookList){
        if (arrayHashSet.getBookName().equals("ahashBookName6")){
            System.out.println(arrayHashSet);
        }
        }

    }
}
