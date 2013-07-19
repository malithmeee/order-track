package org.sms.core.services;

import org.sms.models.Payment;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PaymentService {

    Payment savePayment(Payment payment);

    void deletePayment(Payment payment);

    Payment findPayment(Long id);

    List<Payment> findAllPayments();

    Page<Payment> findAllPayments(int page, int size);
}
