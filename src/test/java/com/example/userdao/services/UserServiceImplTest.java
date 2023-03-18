package com.example.userdao.services;

import com.example.userdao.exception.UserNotExistException;
import com.example.userdao.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    private final String USER_NAME = "Ivan";
    private final String USER_NEW = "Maria";
    private final User user = new User(USER_NAME);
    private final List<User> nameList = new ArrayList<>(Arrays.asList(
            new User("Ivan"),
            new User("Oleg"),
            new User("Pavel"),
            new User("Roman")));
    private UserServiceImpl out;

    @Mock
    private UserDaoImpl userDao;
   @BeforeEach
    public void initOut() {
       out = new UserServiceImpl(userDao);

   }

    @Test
    void checkUserExist() {
        when(userDao.getUserByName(contains(USER_NAME))).thenReturn(user);
        assertEquals(true, out.checkUserExist(USER_NAME));
    }

    @Test
    void checkUserExistException() {
        when(userDao.getUserByName(anyString())).thenThrow(UserNotExistException.class);
        assertThrows(UserNotExistException.class, ()->out.checkUserExist(USER_NEW));
    }
}