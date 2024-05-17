package org.example.Service;

import org.example.Dto.Login;

public interface LoginService {

    void insertLoginData(Login login);
    Boolean validateLogin(Login login);

}
