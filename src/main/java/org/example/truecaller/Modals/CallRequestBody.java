package org.example.truecaller.Modals;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
public class CallRequestBody {
    private Contact contact;
    private LocalDateTime date;
    private LocalDateTime time;
    private String duration;
}
