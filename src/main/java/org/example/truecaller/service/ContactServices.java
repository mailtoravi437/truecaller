package org.example.truecaller.service;

import org.example.truecaller.Modals.Contact;
import org.example.truecaller.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServices {
    @Autowired
    ContactRepository contactRepository;

    public void saveContact(Contact contact){
        contactRepository.save(contact);
    }

    public void deleteContact(Contact contact){
        String id = contact.getId();
        contactRepository.deleteById(Long.valueOf(id));
    }

}
