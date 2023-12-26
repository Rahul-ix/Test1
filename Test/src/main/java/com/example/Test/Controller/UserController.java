package com.example.Test.Controller;

import java.util.List;

import com.example.Test.model.User;
import com.example.Test.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        User users= userService.createUser(user);
        return  userService.createUser(user);


    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {

        return userService.getUsers();
    }


    @PutMapping("/updateuser")
    private User update(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user;
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.deleteUserById(id);
    }
    @GetMapping("/passfail/{id}")
    public User passfail(@PathVariable int id, Model model) {
        User user= new User();
        User passFail= userService.getUserById(id);



        if(passFail.getSAT()>=30){
            System.out.println("Pass");
            long data = passFail.setResult("Pass");

        }
        if(passFail.getSAT()<=30){
            System.out.println("Fail");
        }


        return userService.getUserById(id);



    }



}
