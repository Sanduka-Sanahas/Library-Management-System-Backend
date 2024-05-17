package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Login;
import org.example.Dto.User;
import org.example.Entity.UserEntity;
import org.example.Service.LoginService;
import org.example.Service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    final UserService service;
    final LoginService loginService;

    @GetMapping("/get-all-users")
    public List<UserEntity> getAllUsers(){

        return service.getAllUsers();
    }
    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){

        service.addUser(user);
        loginService.insertLoginData(new Login(user.getEmail(), user.getPassword()));
    }
    @DeleteMapping("/delete-user/{id}")
    public void deleteUser(@PathVariable Long id){

        service.deleteUserById(id);

    }
    @GetMapping("/find-by-user-name/{userName}")
    public User findByUserName(@PathVariable String userName){

        return service.findByUserName(userName);
    }

    @GetMapping("/is-exist-user/{userName}")
    public Boolean isExistsUser(@PathVariable String userName){

       return service.isExistsUser(userName);
    }


}
