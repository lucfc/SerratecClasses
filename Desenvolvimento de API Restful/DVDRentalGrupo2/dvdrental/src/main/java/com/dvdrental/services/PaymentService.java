package com.dvdrental.services;

import java.util.List;

import com.dvdrental.entities.Payment;
import com.dvdrental.repositories.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
	public PaymentRepository paymentRepository;

	public Payment findById(Integer id) {
		Payment payment = paymentRepository.findById(id).get();
		return payment;
	}

	public List<Payment> findAll() {
		List<Payment> listaPayment = paymentRepository.findAll();
		return listaPayment;
	}

	public Long count() {
		Long totalPayment = paymentRepository.count();
		return totalPayment;
	}

	public Payment save(Payment payment) {
		Payment novoPayment = paymentRepository.save(payment);

		if (novoPayment.getPaymentId() != null) {
			return novoPayment;
		} else {
			return null;
		}
	}

	public Payment update(Payment payment, Integer id) {
		payment.setPaymentId(id);
		// o this se refere ao paymentRepository
		return this.save(payment);

//		Payment payment = paymentRepository.findById(id).get();
//		atualizarDados(payment, novoPayment);
//		return paymentRepository.save(payment);
	}
}
