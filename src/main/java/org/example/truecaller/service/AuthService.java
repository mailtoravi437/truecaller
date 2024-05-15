package org.example.truecaller.service;

import org.example.truecaller.Modals.Login;
import org.example.truecaller.Modals.User;
import org.example.truecaller.WrongCredentialsException;
import org.example.truecaller.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;
    public User register(User user){
        return userRepository.save(user);
    }

    public User login(Login loginDetails) throws WrongCredentialsException{
        String email = loginDetails.getEmail();
        String password = loginDetails.getPassword();

        String currentPassword = userRepository.findByEmail(email).getPassword();
        if(currentPassword.equals(password)){
            return userRepository.findByEmail(email);
        }
        throw  new WrongCredentialsException();
    }

    public void logout(){
        System.out.println("Logged out successfully");
    }

}
