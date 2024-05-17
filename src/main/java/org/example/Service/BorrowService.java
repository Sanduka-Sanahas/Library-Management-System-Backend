package org.example.Service;

import org.example.Dto.BorrowBook;
import org.example.Entity.BorrowBookEntity;

import java.util.List;

public interface BorrowService {

    void saveDetails(BorrowBook borrowBook);
    List<BorrowBookEntity> getAll();
}
