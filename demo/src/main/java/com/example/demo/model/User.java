package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    public Long id;

    public String login;

    public String password;

    public int age;

    public int salary;

    public String name;

    public LocalDate birthday;

//    public boolean active;

    public List<Role> roles;
}
