package com.example.Test.userService;

import java.util.List;
import java.util.Optional;

import com.example.Test.dao.UserRepository;
import com.example.Test.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> createUsers(List<User> users) {
        return userRepository.saveAll(users);
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }


    public User updateUser(User user) {
        User oldUser=user;
       Optional<User> optionaluser=userRepository.findById(user.getId());
        if(optionaluser.isPresent() || optionaluser.isEmpty()) {
            oldUser=optionaluser.get();
            oldUser.setName(user.getName());
            oldUser.setAddress(user.getAddress());
            oldUser.setSAT(user.getSAT());
              oldUser.getSAT();
            userRepository.save(oldUser);
        }else {
            return new User();
        }
        return oldUser;
    }

    public String deleteUserById(int id) {
        userRepository.deleteById(id);
        return "User got deleted";
    }

    public void saveOrUpdate(User user)
    {
        userRepository.save(user);
    }
}
