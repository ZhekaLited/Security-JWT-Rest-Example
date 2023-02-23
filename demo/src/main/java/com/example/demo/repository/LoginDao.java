package com.example.demo.repository;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface LoginDao {

    User findByUserAuth(String username) throws ClassNotFoundException;

    List<Role> findByRolesAuth(String login) throws SQLException;
}
