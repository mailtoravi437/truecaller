package org.example.truecaller.repository;

import org.example.truecaller.Modals.Call;
import org.example.truecaller.Modals.Calllog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallLogRepository extends JpaRepository<Call, Long> {
}
