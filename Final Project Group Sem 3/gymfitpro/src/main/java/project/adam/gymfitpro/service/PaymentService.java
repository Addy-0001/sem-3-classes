package project.adam.gymfitpro.service;

import java.util.List;

import project.adam.gymfitpro.entity.PaymentEntity;


public interface PaymentService {
    List<PaymentEntity> getAllPayments();
    PaymentEntity getPaymentById(Integer id);
    PaymentEntity createPayment(PaymentEntity payment);
    PaymentEntity updatePayment(Integer id, PaymentEntity payment);
    void deletePayment(Integer id);
}