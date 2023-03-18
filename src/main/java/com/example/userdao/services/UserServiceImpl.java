package com.example.userdao.services;

import com.example.userdao.exception.UserNotExistException;
import com.example.userdao.model.User;
import com.example.userdao.services.impl.UserService;

import java.util.*;

public class UserServiceImpl implements UserService {

    private final UserDaoImpl nameRepository;
    private List<User> nameList = new ArrayList<>();

    public UserServiceImpl(UserDaoImpl nameRepository) {
        this.nameRepository = nameRepository;
    }

    @Override
    public User getUserByName(String name) {
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
    public boolean checkUserExist(String name) {
        if (nameRepository.getUserByName(name) == null) {
            throw new UserNotExistException();
        }
        return true;
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

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "nameList=" + nameList +
                '}';
    }
}
