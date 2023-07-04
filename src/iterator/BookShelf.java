package iterator;

import com.sun.source.tree.LambdaExpressionTree;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BookShelf implements Iterable<Book> {

    private Book[] books;
    private int last = 0;

    public BookShelf(int max) {
        this.books = new Book[max];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return books.length;
    }

    @Override
    public Iterator<Book> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Book> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Book> spliterator() {
        return Iterable.super.spliterator();
    }

    public class BookShelfIterator implements Iterator<Book> {
        private BookShelf bookShelf;
        private int index;

        public BookShelfIterator(BookShelf bookShelf) {
            this.bookShelf = bookShelf;
            this.index=0;
        }

        @Override
        public boolean hasNext() {
            if(index < bookShelf.getLength()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Book next() {
            if(!hasNext()) {
                throw new NoSuchElementException("없다고 다음자료");
            }
            Book book = bookShelf.getBookAt(index);
            index++;
            return book;
        }
    }
}
