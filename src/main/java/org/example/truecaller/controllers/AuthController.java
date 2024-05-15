package org.example.truecaller.controllers;

import org.example.truecaller.Modals.Login;
import org.example.truecaller.Modals.User;
import org.example.truecaller.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user){
        User newUserCreated = authService.register(user);
        return new ResponseEntity<>(newUserCreated, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody Login loginDetails){
        User user = authService.login(loginDetails);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout(){
        authService.logout();
        return new ResponseEntity<>("Logged out successfully", HttpStatus.OK);
    }
}
