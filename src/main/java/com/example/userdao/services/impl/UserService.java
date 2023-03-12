package com.example.userdao.services.impl;

import com.example.userdao.model.User;

import java.util.Collection;

public interface UserService {

   String getUserByName(String name);

    Collection<User> findAllUsers();

    String checkUserExist(String name);
}
