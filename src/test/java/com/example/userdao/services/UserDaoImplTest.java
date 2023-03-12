package com.example.userdao.services;

import com.example.userdao.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {

    private static User user;
    private final String USER_NAME = "Ivan";

    @Before
    private static void createNewUser() {
        user = new User("Maria");
    }

    @Test
    public void getUserByName() {
        Assert.assertNotNull(USER_NAME);
    }

    @Test
    public void getUserNullName() {
        Assert.assertNull(user);
    }


}