package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    public Long id;
    public String login;
    public String password;
    public int age;
    public int salary;
    public String name;
    public LocalDate birthday;
    public List<Role> roles;

}
