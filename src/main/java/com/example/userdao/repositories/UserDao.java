package com.example.userdao.repositories;

import com.example.userdao.model.User;

import java.util.Collection;

public interface UserDao {


    User getUserByName(String name);

    Collection<User> findAllUsers();
}
