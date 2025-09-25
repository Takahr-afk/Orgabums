package com.jannikscode.orgabums;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void addCase() {
        User user = new User("test");
        user.addCase("1", "Test Case");
        assertEquals(1, user.getUser_Cases().size());
    }

    @Test
    void removeCase() {
        User user = new User("test");
        user.addCase("1", "Test Case");
        assertEquals(1, user.getUser_Cases().size());
        user.removeCase("1");
        assertEquals(0, user.getUser_Cases().size());
    }

    @Test
    void getUsername() {
        User user = new User("test");
        assertEquals("test", user.getUsername());
    }

    @Test
    void getUser_Cases() {
        HashMap<String, String> user_Cases = new HashMap<>();
        user_Cases.put("1", "Test Case");
        User user = new User("test", user_Cases);
        assertEquals(1, user.getUser_Cases().size());
    }

    @Test
    void setUsername() {
        User user = new User("test");
        user.setUsername("test2");
        assertEquals("test2", user.getUsername());
    }

    @Test
    void setUser_Cases() {
        HashMap<String, String> user_Cases = new HashMap<>();
        user_Cases.put("1", "Test Case");
        User user = new User("test");
        user.setUser_Cases(user_Cases);
        assertEquals(1, user.getUser_Cases().size());
    }
}