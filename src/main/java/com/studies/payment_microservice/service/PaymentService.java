package com.studies.payment_microservice.service;

import com.studies.payment_microservice.model.Payment;

public interface PaymentService {
	
	void sendPayment(Payment payment);
}
