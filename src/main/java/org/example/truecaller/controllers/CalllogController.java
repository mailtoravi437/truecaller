package org.example.truecaller.controllers;

import org.example.truecaller.Modals.CallRequestBody;
import org.example.truecaller.Modals.Contact;
import org.example.truecaller.service.CalllogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/calllog")
public class CalllogController {
    @Autowired
    CalllogService calllogService;
    @PostMapping("/add")
    public void addToCallLog(@RequestBody CallRequestBody callRequestBody){
        calllogService.addToCallLog(callRequestBody);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFromCallLog(@RequestBody String id){
        calllogService.deleteFromCallLog(id);
    }
}
