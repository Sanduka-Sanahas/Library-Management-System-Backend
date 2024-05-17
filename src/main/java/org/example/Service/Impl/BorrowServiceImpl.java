package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.Dto.BorrowBook;
import org.example.Entity.BorrowBookEntity;
import org.example.Repository.BorrowBookRepository;
import org.example.Service.BorrowService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BorrowServiceImpl implements BorrowService {

    final BorrowBookRepository bookRepository;
    final ModelMapper mapper;

    @Override
    public void saveDetails(BorrowBook borrowBook) {

        bookRepository.save( mapper.map(borrowBook, BorrowBookEntity.class));
    }

    @Override
    public List<BorrowBookEntity> getAll() {
        return bookRepository.findAll();
    }
}
