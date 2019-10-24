package com.suulola.springjsp.service;

import org.springframework.stereotype.Service;

@Service

public class LoginService {

    public boolean validateUser(String username, String password) {
        return username.equalsIgnoreCase("mysuulola") && password.equals("ecobank");
    }
}
