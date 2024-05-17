package org.example.Repository;

import org.example.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByUserName(String userName);

    Boolean existsByUserName(String userName);



}
