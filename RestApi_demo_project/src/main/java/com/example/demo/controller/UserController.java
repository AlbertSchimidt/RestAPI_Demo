package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserService iUsuarioService;

    @GetMapping("/users")
    public List<User> getAll() {
        return iUsuarioService.findAll();
    }

}
