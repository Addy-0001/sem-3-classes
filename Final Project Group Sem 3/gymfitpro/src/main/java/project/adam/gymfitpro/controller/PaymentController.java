package project.adam.gymfitpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import project.adam.gymfitpro.entity.PaymentEntity;
import project.adam.gymfitpro.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public List<PaymentEntity> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public PaymentEntity getPaymentById(@PathVariable Integer id) {
        return paymentService.getPaymentById(id);
    }

    @PostMapping
    public PaymentEntity createPayment(@RequestBody PaymentEntity payment) {
        return paymentService.createPayment(payment);
    }

    @PutMapping("/{id}")
    public PaymentEntity updatePayment(@PathVariable Integer id, @RequestBody PaymentEntity payment) {
        return paymentService.updatePayment(id, payment);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Integer id) {
        paymentService.deletePayment(id);
    }
}