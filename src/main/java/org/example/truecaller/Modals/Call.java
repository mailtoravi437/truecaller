package org.example.truecaller.Modals;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Call {
    @Id
    private Long id;
    @OneToOne
    private Contact contact;
    private CallType callType;
    private LocalDateTime date;
}
