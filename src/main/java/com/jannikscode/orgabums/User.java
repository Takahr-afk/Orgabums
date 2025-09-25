package com.jannikscode.orgabums;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
@Builder
public class User {

    final private String username;

    // Cases of the user, Unique Case ID as Key, Case Name as Value
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
