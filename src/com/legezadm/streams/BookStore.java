package com.legezadm.streams;

public class BookStore {

    public static Condition computeCondition(int missingPages) {
        return missingPages > 10 ? Condition.BAD : Condition.GOOD;
    }

    public static void generateISBN(Book book) {
        book.setISBN(new ISBN(book));
    }

}
