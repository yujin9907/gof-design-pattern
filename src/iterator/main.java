package iterator;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("1"));
        bookShelf.appendBook(new Book("2"));
        bookShelf.appendBook(new Book("3"));

        // 일반적인 확장 for 문
        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }

        // 명시적으로 Iterator 사용
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }

    }
}
