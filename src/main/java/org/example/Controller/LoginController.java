package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Dto.Login;
import org.example.Repository.LoginRepository;
import org.example.Service.LoginService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    final LoginService service;

    @PostMapping("/request-login")
    public Boolean validateLogin(@RequestBody Login login){

    return service.validateLogin(login);

    }
}
