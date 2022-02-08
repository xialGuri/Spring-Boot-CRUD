package com.example.LFAdmin_demo.UserService;

import com.example.LFAdmin_demo.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.LFAdmin_demo.dto.UserDTO;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDTO insertUser(UserDTO user) {
        return userRepository.inasertUser(user);
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public UserDTO getUserByUserId (String userId) {
        return userRepository.getUserByUserId(userId);
    }

    public void updateuserPw(String userId, UserDTO user) {
        userRepository.updateUserPw(userId, user);

    }

    public void deleteUser(String userId) {
        userRepository.deleteUser(userId);
    }
}

