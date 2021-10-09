/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhk.service;

import com.dhk.pojos.User;
import java.util.List;
import org.springframework.security.core.userdetails.UserDetailsService;



/**
 *
 * @author DELL
 */
public interface UserService extends UserDetailsService{
    boolean addUser(User user);
    List<User> getUsers(String username);
    User getUserById(int id);
}
