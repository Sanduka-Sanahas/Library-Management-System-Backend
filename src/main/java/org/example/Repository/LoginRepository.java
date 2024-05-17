package org.example.Repository;

import org.example.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginEntity,Long> {

    Boolean existsByEmailAndPassword(String email , String password);
}
