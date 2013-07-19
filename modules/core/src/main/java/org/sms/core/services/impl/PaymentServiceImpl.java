package org.sms.core.services.impl;

import org.sms.core.services.PaymentService;
import org.sms.models.Payment;
import org.sms.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@Service("paymentService")
@ContextConfiguration(locations = "classpath:META-INF/application-context.xml")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public void deletePayment(Payment payment) {
        paymentRepository.delete(payment);
    }

    public Payment findPayment(Long id) {
        return paymentRepository.findOne(id);
    }

    public List<Payment> findAllPayments() {
        return paymentRepository.findAll();
    }

    public Page<Payment> findAllPayments(int page, int size) {
        return paymentRepository.findAll(new PageRequest(page, size));
    }
}