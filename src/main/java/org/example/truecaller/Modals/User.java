package org.example.truecaller.Modals;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String email;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String countryCode;
    private boolean isVerified;
    private String profilePictureUrl;
    private boolean blocked;
}
