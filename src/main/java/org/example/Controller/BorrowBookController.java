package org.example.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Dto.BorrowBook;
import org.example.Entity.BorrowBookEntity;
import org.example.Service.BorrowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrow-books")
@CrossOrigin
@RequiredArgsConstructor
@Slf4j
public class BorrowBookController {

    final BorrowService borrowService;

    @PostMapping("/add-borrow-details")
    public void addBorrowDetails(@RequestBody BorrowBook borrowBook){

        borrowService.saveDetails(borrowBook);
        log.info(borrowBook.toString());

    }
    @GetMapping("/get-all")
    public List<BorrowBookEntity> getAll(){

        return borrowService.getAll();
    }

}
