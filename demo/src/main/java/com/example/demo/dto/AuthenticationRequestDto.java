package com.example.demo.dto;

import lombok.Data;

@Data
public class AuthenticationRequestDto {
   private Long id;
   private String login;
   private String password;
}
