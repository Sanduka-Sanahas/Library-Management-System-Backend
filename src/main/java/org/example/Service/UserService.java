package org.example.Service;

import org.example.Dto.User;
import org.example.Entity.UserEntity;

import java.util.List;

public interface UserService {

    List<UserEntity> getAllUsers();

    void addUser(User user);


    void deleteUserById(Long id);

    User findByUserName(String userName);


    Boolean isExistsUser(String userName);
}
