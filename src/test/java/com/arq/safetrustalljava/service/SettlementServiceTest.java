package com.arq.safetrustalljava.service;

import com.arq.safetrustalljava.repository.SettlementRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SettlementServiceTest {
    @Test
    void returnsSeedData() {
        SettlementService service = new SettlementService(new SettlementRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
