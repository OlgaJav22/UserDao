package com.example.userdao.services.impl;

import com.example.userdao.model.User;

import java.util.Collection;

public interface UserService {

   User getUserByName(String name);

    Collection<User> findAllUsers();

    boolean checkUserExist(String name);
}
