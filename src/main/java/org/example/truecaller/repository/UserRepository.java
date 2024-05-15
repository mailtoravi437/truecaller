package org.example.truecaller.repository;

import ch.qos.logback.core.net.SMTPAppenderBase;
import org.example.truecaller.Modals.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{

       User findByEmail(String email);

       User findByName(String name);

       User findByNumber(String number);
}
