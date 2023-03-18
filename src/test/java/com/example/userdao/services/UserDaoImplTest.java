package com.example.userdao.services;

import com.example.userdao.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {


    private final String USER_NAME = "Ivan";
    private final String USER_1 = "Maria";
    private final User user = new User(USER_NAME);

    UserDaoImpl userDao;
    @BeforeEach
    private void createNewUser() {
        userDao = new UserDaoImpl();
    }

    @Test
    public void getUserByName() {
      Assert.assertEquals(user, userDao.getUserByName(USER_NAME));

    }

    @Test
    public void getUserNullName() {
        Assert.assertNull(null, userDao.getUserByName(USER_1));}


    }


