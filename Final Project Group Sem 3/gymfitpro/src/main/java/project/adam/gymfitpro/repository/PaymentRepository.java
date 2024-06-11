package project.adam.gymfitpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.adam.gymfitpro.entity.PaymentEntity;
import project.adam.gymfitpro.entity.PaymentId;

public interface PaymentRepository extends JpaRepository<PaymentEntity, PaymentId> {

}
