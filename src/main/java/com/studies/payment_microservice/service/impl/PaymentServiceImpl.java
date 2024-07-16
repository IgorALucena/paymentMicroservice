package com.studies.payment_microservice.service.impl;

import com.studies.payment_microservice.model.Payment;
import com.studies.payment_microservice.service.PaymentService;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PaymentServiceImpl implements PaymentService {

	@Override
	public void sendPayment(Payment payment) {
		log.info("PAYMENT_SERVICE IMPL ::: Recebi o pagamento: {}", payment);
		
	}

}
