package com.example.LFAdmin_demo.UserController;

import com.example.LFAdmin_demo.UserService.UserService;
import com.example.LFAdmin_demo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    //CRUD를 만들어야함
    //C -> Post
    //R -> Get
    //U -> Put
    //D -> Delete

    @PostMapping("")
    public UserDTO insertuser(@RequestBody UserDTO user) {
        return userService.insertUser(user);
    }
    @GetMapping("")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }
    @GetMapping("/{userId}")
    public UserDTO getUserByUserId(String userId) {
        return userService.getUserByUserId(userId);
    }
    @PutMapping("/{userId}")
    public void updateUserPw(@PathVariable String userId, @RequestBody UserDTO user){
        userService.updateuserPw(userId, user);
    }
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
    }
}
