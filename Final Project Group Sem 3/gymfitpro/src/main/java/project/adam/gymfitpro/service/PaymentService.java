package project.adam.gymfitpro.service;

import java.util.List;

import project.adam.gymfitpro.entity.PaymentEntity;

public interface PaymentService {
    List<PaymentEntity> getAllPayments();

    PaymentEntity getPaymentById(String id);

    PaymentEntity createPayment(PaymentEntity payment);

    PaymentEntity updatePayment(String id, PaymentEntity payment);

    void deletePayment(String id);
}