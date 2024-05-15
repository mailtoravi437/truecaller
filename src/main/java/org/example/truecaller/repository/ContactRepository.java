package org.example.truecaller.repository;

import org.example.truecaller.Modals.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
