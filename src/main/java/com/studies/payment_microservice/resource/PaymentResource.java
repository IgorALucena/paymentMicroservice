package com.studies.payment_microservice.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.studies.payment_microservice.model.Payment;

public interface PaymentResource {

	@PostMapping
	ResponseEntity<Payment> payment(@RequestBody Payment payment);
}
