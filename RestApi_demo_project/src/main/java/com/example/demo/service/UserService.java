package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.mockdata.UserMockData;
import com.example.demo.service.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Override
    public List<User> findAll() {

        return UserMockData.getUserMockData();
    }
}
