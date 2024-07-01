package com.essalmi.tp_cassandra.services;

import com.essalmi.tp_cassandra.entities.User;
import com.essalmi.tp_cassandra.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void addUser(User user){
        user.setId(UUID.randomUUID());
        userRepository.insert(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
