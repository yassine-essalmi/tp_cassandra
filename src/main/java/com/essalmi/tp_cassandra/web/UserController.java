package com.essalmi.tp_cassandra.web;

import com.essalmi.tp_cassandra.entities.User;
import com.essalmi.tp_cassandra.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping()
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping()
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

}
