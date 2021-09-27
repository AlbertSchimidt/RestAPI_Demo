package com.example.demo.model.builder;

import com.example.demo.model.User;

public final class UserBuilder {
    private User user;

    private UserBuilder() {
        user = new User();
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder withId(Integer id) {
        user.setId(id);
        return this;
    }

    public UserBuilder withNome(String nome) {
        user.setNome(nome);
        return this;
    }

    public UserBuilder but() {
        return anUser().withId(user.getId()).withNome(user.getNome());
    }

    public User build() {
        return user;
    }
}
