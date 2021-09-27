package com.example.demo.model.mockdata;

import com.example.demo.model.User;
import com.example.demo.model.builder.UserBuilder;

import java.util.ArrayList;
import java.util.List;

public class UserMockData {

    public static List<User> getUserMockData() {
        List<User> userList = new ArrayList<>();

        userList.add(UserBuilder.anUser().withId(userList.size() + 1).withNome("Albert").build());
        userList.add(UserBuilder.anUser().withId(userList.size() + 1).withNome("Gauchera").build());
        userList.add(UserBuilder.anUser().withId(userList.size() + 1).withNome("Alice").build());
        userList.add(UserBuilder.anUser().withId(userList.size() + 1).withNome("Fa").build());
        userList.add(UserBuilder.anUser().withId(userList.size() + 1).withNome("Kraken").build());
        userList.add(UserBuilder.anUser().withId(userList.size() + 1).withNome("Bigu").build());

        return userList;
    }

}
