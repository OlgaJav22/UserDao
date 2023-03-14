package com.example.userdao.services;

import com.example.userdao.model.User;
import com.example.userdao.repositories.UserDao;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserDaoImpl implements UserDao {
    private User user;
    private Set<User> nameList = new HashSet<>();

    public UserDaoImpl(Set<User> nameList) {
        this.nameList = (Set.of
                (new User("Ivan"),
                        new User("Oleg"),
                        new User("Pavel"),
                        new User("Roman")));
    }

    @Override
    public String getUserByName(String name) {
        if (!nameList.contains(name)) {
            return null;
        } else if (name != null && !name.isEmpty() && !name.isBlank()) {
            Stream<User> stream = nameList.stream();
            stream.filter(user1 -> user.getName().equals(name)).collect(Collectors.toSet());
        }
        return user.getName();
    }

    @Override
    public Collection<User> findAllUsers() {
        return Collections.unmodifiableCollection(nameList);
    }


}
