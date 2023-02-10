package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import ru.kata.spring.boot_security.demo.model.Roles;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    List<User> getAllUserList();

    User findByUsername(String username);

    void addUser(User user);

    void addRoles(Roles role);

    User getUserById(int id);

    void update(int id, User user);

    void delete(int id);

    UserDetails loadUserByUsername(String username);

    List<Roles> getListRoles();

}




