package com.divecastro.inkindex.users;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>(Arrays.asList(
            new User("0", "Antonio", "Castro"),
            new User("1", "Dhruv", "Divekar"),
            new User("2", "Mark", "Zuckerburg"),
            new User("3", "Romeo", "Lacoste"),
            new User("4", "Oliver", "Peck")
            ));

    public List<User> getAllUsers() {
        return users;
    }

}
