package com.example.userdao.services;

import com.example.userdao.exception.UserNotExistException;
import com.example.userdao.model.User;
import com.example.userdao.services.impl.UserService;

import java.util.*;

public class UserServiceImpl implements UserService {

    private final UserDaoImpl nameRepository;
    private Set<User> nameList = new HashSet<>();

    public UserServiceImpl(UserDaoImpl nameRepository) {
        this.nameRepository = nameRepository;
    }

    @Override
    public String getUserByName(String name) {
        return nameRepository.getUserByName(name);
    }

    @Override
    public Collection<User> findAllUsers() {
        return nameRepository.findAllUsers();
    }

    public UserDaoImpl getNameRepository() {
        return nameRepository;
    }

    @Override
    public String checkUserExist(String name) {
        if (nameRepository.getUserByName(name) == null) {
            throw new UserNotExistException();
        }
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserServiceImpl that = (UserServiceImpl) o;
        return Objects.equals(nameRepository, that.nameRepository) && Objects.equals(nameList, that.nameList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRepository, nameList);
    }
}
