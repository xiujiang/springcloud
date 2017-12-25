package com.joel.Controller;

import com.joel.Dao.UserRepository;
import com.joel.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by joel on 2017/12/16.
 * controller
 */
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/")
    String home(){
        return "hello world!";
    }

    @GetMapping("/{Id}")
    public User findById(@PathVariable String Id){
        System.out.println("id:"+Id);
        Long longId=  Long.parseLong(Id);
        User findOne = userRepository.findOne(longId);
        return findOne;
    }
}
