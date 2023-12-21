package com.jwt.example.JWTAuthenticationExample.services;

import com.jwt.example.JWTAuthenticationExample.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Deep Panchal","deepp@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Meet Panchal","meett@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ankit Panchal","ankitt@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Jay Panchal","jayy@gmail.com"));
    }

    public List<User> getUsers() {
        return store;
    }
}
