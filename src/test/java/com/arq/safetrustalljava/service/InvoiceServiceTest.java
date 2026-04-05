package com.arq.safetrustalljava.service;

import com.arq.safetrustalljava.repository.InvoiceRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class InvoiceServiceTest {
    @Test
    void returnsSeedData() {
        InvoiceService service = new InvoiceService(new InvoiceRepository());
        assertFalse(service.summarize().isEmpty());
    }
}
