package org.example.Service.Impl;

import org.example.Dto.Book;
import org.example.Entity.BookEntity;
import org.example.Repository.BookRepository;
import org.example.Service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
   @Autowired
   BookRepository bookRepository;

    ModelMapper mapper ;

    @Bean
    public void setup(){

        this.mapper = new ModelMapper();
    }
    @Override
    public void addBook(Book book) {

        BookEntity entity = mapper.map(book,BookEntity.class);
        bookRepository.save(entity);

    }

    @Override
    public List<BookEntity> getBooks() {
        return  bookRepository.findAll();
    }

    @Override
    public boolean deleteBook(Long id) {

        if(bookRepository.existsById(id)){

            bookRepository.deleteById(id);

           return true;

        }else{

            return false;
        }
    }

    @Override
    public Book getBookById(Long id) {

        Optional<BookEntity> byId =  bookRepository.findById(id);

        return mapper.map(byId, Book.class);
    }

    @Override
    public void addList(List<Book> bookList) {

        List<BookEntity> entities = new ArrayList<>();
        bookList.forEach(book -> {
            entities.add( mapper.map(book, BookEntity.class));
        });
        bookRepository.saveAll(entities);
    }
}
