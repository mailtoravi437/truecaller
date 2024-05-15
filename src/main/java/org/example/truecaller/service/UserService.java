package org.example.truecaller.service;

import org.example.truecaller.Modals.User;
import org.example.truecaller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String updateUserProfile(User user){
       userRepository.save(user);
       return user.getUserId();
    }

    public Optional<User> searchByName(String name){
        Optional<User> user  = Optional.ofNullable(userRepository.findByName(name));
        return user;
    }

    public Optional<User> searchByNumber(String number){
        Optional<User> user = Optional.ofNullable(userRepository.findByNumber(number));
        return user;
    }

    public void blockUser(String number) {
        User user = userRepository.findByNumber(number);
        if(user != null){
            user.setBlocked(true);
            userRepository.save(user);
        }
    }

    public void unblockUser(String number) {
        User user = userRepository.findByNumber(number);
        if(user != null){
            user.setBlocked(false);
            userRepository.save(user);
        }
    }
}
