package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Book;
import org.example.Entity.BookEntity;
import org.example.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
@CrossOrigin
public class BookController {


   final BookService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBook(@RequestBody Book book) {

        service.addBook(book);
    }

    @GetMapping("/getBooks")
//    @ResponseStatus(HttpStatus.FOUND)
    public Iterable<BookEntity> getBooks(){

        return service.getBooks();
    }

    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteBook(@PathVariable Long id){

      return service.deleteBook(id) ?
              ResponseEntity.ok("Deleted") : ResponseEntity.notFound().build();



    }

    @GetMapping("/search/{id}")
//    @ResponseStatus(HttpStatus.FOUND)
    public Book getBookById( @PathVariable Long id){

        return service.getBookById(id);
    }

    @PostMapping("/add-list")
    public void addList(@RequestBody List<Book> bookList){

            service.addList(bookList);
    }

}
