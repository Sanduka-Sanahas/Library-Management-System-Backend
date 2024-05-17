package org.example.Service;

import org.example.Dto.Book;
import org.example.Entity.BookEntity;

import java.util.List;

public interface BookService {

    void addBook(Book book);
    List<BookEntity> getBooks();
    boolean deleteBook( Long id);

    Book getBookById(Long id);
    void addList(List<Book> bookList);
}
