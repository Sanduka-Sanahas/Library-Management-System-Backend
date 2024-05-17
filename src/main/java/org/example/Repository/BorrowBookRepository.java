package org.example.Repository;

import org.example.Entity.BorrowBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowBookRepository extends JpaRepository<BorrowBookEntity,Long> {
}
