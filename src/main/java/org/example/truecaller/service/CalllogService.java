package org.example.truecaller.service;

import org.example.truecaller.Modals.Call;
import org.example.truecaller.Modals.CallRequestBody;
import org.example.truecaller.repository.CallLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalllogService {
    @Autowired
    CallLogRepository callLogRepository;

    public void addToCallLog(CallRequestBody callRequestBody) {
       Call call = new Call();
       call.setContact(callRequestBody.getContact());
       call.setDate(callRequestBody.getDate());
       callLogRepository.save(call);

    }

    public void deleteFromCallLog(String id) {
        callLogRepository.deleteById(Long.parseLong(id));
    }
}
