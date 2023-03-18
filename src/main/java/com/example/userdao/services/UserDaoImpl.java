package com.example.userdao.services;

import com.example.userdao.model.User;
import com.example.userdao.repositories.UserDao;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserDaoImpl implements UserDao {
    private User user1;
    private List<User> nameList = new ArrayList<>();

    public UserDaoImpl() {
        this.nameList = (Arrays.asList(
                new User("Ivan"),
                new User("Oleg"),
                new User("Pavel"),
                new User("Roman")));
    }

    @Override
    public User getUserByName(String name) {
        user1 = new User(name);
        if (nameList.contains(user1)) {
            return user1;
        }
        return null;
    }

    @Override
    public Collection<User> findAllUsers() {
        return Collections.unmodifiableCollection(nameList);
    }


}
