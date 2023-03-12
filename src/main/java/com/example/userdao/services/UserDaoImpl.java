package com.example.userdao.services;

import com.example.userdao.model.User;
import com.example.userdao.repositories.UserDao;

import java.util.*;

public class UserDaoImpl implements UserDao {

    private Set<User> nameList;

    public UserDaoImpl(Set<User> nameList) {
        this.nameList = new HashSet<>(Set.of
                (new User("Ivan"),
                        new User("Oleg"),
                        new User("Pavel"),
                        new User("Roman")));
    }

    @Override
    public String getUserByName(String name) {
        if (!nameList.contains(name)) {
            return null;
        }
        return name;
    }

    @Override
    public Collection<User> findAllUsers() {
        return Collections.unmodifiableCollection(nameList);
    }


}
