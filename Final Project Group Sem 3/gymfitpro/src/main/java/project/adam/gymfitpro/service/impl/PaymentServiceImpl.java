package project.adam.gymfitpro.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.adam.gymfitpro.entity.PaymentEntity;
import project.adam.gymfitpro.repository.PaymentRepository;
import project.adam.gymfitpro.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<PaymentEntity> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public PaymentEntity getPaymentById(Integer id) {
        Optional<PaymentEntity> payment = paymentRepository.findById(id);
        return payment.orElse(null);
    }

    @Override
    public PaymentEntity createPayment(PaymentEntity payment) {
        return paymentRepository.save(payment);
    }

    @Override
    public PaymentEntity updatePayment(Integer id, PaymentEntity payment) {
        if (paymentRepository.existsById(id)) {
            payment.setId(id);
            return paymentRepository.save(payment);
        }
        return null;
    }

    @Override
    public void deletePayment(Integer id) {
        paymentRepository.deleteById(id);
    }
}