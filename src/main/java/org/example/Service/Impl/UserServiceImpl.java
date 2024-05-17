package org.example.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.example.Dto.User;
import org.example.Entity.UserEntity;
import org.example.Repository.UserRepository;
import org.example.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper mapper;

    @Override
    public List<UserEntity> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public void addUser(User user) {

       UserEntity entity = mapper.map(user, UserEntity.class);
       repository.save(entity);
    }

    @Override
    public void deleteUserById(Long id) {

        repository.deleteById(id);
    }

    @Override
    public User findByUserName(String userName) {

        return mapper.map(repository.findByUserName(userName), User.class);
    }

    @Override
    public Boolean isExistsUser(String userName) {

       return repository.existsByUserName(userName);
    }


}
