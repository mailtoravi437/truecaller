package org.example.truecaller.controllers;

import org.example.truecaller.Modals.User;
import org.example.truecaller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PutMapping("/update")
    public ResponseEntity<String> updateUserProfile(@RequestBody User user){
        userService.updateUserProfile(user);
        return new ResponseEntity<>(user.getUserId(), HttpStatus.OK);
    }

   @PostMapping("/searchByName/{name}")
    public ResponseEntity<User> searchByName(@PathVariable String name){
       Optional<User> user = userService.searchByName(name);
       return user.isPresent() ? new ResponseEntity<User>(user.get(),HttpStatus.OK): new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/searchById/{number}")
    public ResponseEntity<User> searchById(@PathVariable String number) {
        Optional<User> user = userService.searchByNumber(number);
        return user.isPresent() ? new ResponseEntity<User>(user.get(), HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/block/{number}")
    public ResponseEntity<String> blockUser(@PathVariable String number){
        userService.blockUser(number);
        return new ResponseEntity<>("User blocked successfully", HttpStatus.OK);
    }

    @PostMapping("/unblock/{number}")
    public ResponseEntity<String> unblockUser(@PathVariable String number){
        userService.unblockUser(number);
        return new ResponseEntity<>("User unblocked successfully", HttpStatus.OK);
    }
}
