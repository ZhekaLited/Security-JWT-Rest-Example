package com.example.demo.repository;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class LoginDaoImpl implements LoginDao {

    @Autowired
    UserMapper userMapper;

    public User findByUserAuth(String username) throws ClassNotFoundException {
        return userMapper.getAllLogin(username);

    }

    public List<Role> findByRolesAuth(String login) throws SQLException {
        List<Role> roles = userMapper.getAllRole(login);
        return roles;
    }
}
