/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhk.controllers;
import com.dhk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DELL
 */
@Controller
public class Homecontrollers {
    
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model) {
        
        model.addAttribute("user", this.userService.getUserById(1));
        return "index";
    }
   
    
}
