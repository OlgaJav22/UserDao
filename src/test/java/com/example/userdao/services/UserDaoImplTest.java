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
    private final String USER_1 = "Maria";

    @BeforeEach
    private void createNewUser() {
        user = new User("Olga");
    }

    @Test
    public void getUserByName() {
        Assert.assertNotNull(USER_NAME);
        Assert.assertEquals("Ivan", USER_NAME);

    }

    @Test
    public void getUserNullName() {
           Assert.assertNull (USER_1);
    }


}