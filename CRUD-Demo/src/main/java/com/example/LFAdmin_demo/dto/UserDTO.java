package com.example.LFAdmin_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor

public class UserDTO {
    private String username;
    private String userId;
    private String userPW;
}
