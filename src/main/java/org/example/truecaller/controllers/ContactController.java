package org.example.truecaller.controllers;

import org.example.truecaller.Modals.Contact;
import org.example.truecaller.service.ContactServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ContactController {
    @Autowired
    ContactServices contactServices;
    @PostMapping("/saveContact")
    public ResponseEntity<Void> saveContact(@RequestBody Contact contact){
        contactServices.saveContact(contact);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteContact/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Contact contact){
        contactServices.deleteContact(contact);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateContact")
    public ResponseEntity<Void> updateContact(@RequestBody Contact contact){
        contactServices.saveContact(contact);
        return ResponseEntity.ok().build();
    }
}
