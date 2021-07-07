package com.learning.accessingdatamysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.accessingdatamysql.entities.User;
import com.learning.accessingdatamysql.repository.UserRepository;

@Controller
@RequestMapping(path="/user")
class UserController {

    @Autowired
    private UserRepository userRep;

    @PostMapping(path="/add")
    public @ResponseBody String addUser(@RequestParam String name, @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRep.save(n);
        return "Saved";
    }

    @GetMapping(path = "/view")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRep.findAll();
    }
} 
