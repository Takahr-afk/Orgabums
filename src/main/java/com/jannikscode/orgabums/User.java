package com.jannikscode.orgabums;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

public class User {
    @Setter
    @Getter
    private String username;
    @Setter
    @Getter
    private HashMap<String, String> user_Cases;

    public User(String username) {
        this.username = username;
        this.user_Cases = new HashMap<>();
    }

    public User(String username, HashMap<String, String> user_Cases) {
        this.username = username;
        this.user_Cases = user_Cases;
    }

    public void addCase(String case_id, String case_name) {
        this.user_Cases.put(case_id, case_name);
    }

    public void removeCase(String case_id) {
        this.user_Cases.remove(case_id);
    }

}
