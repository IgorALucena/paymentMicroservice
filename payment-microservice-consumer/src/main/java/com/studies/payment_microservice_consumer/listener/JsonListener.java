package com.studies.payment_microservice_consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.studies.payment_microservice_consumer.model.Payment;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class JsonListener {

	@SneakyThrows
	@KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
	public void antiFraud(@Payload Payment payment) {
		log.info("Pagamento recebido {}", payment.toString());
		Thread.sleep(2000);
		log.info("Validando fraude...");
		Thread.sleep(2000);
		log.info("Compra Aprovada...");
		Thread.sleep(2000);

	}

	/* simulação de outros listeners em outros microserviços */
	@SneakyThrows
	@KafkaListener(topics = "payment-topic", groupId = "voucher-group", containerFactory = "jsonContainerFactory")
	public void pdfGenerator(@Payload Payment payment) {
		Thread.sleep(3000);
		log.info("Gerando comprovante da transação {}", payment.getId());
		Thread.sleep(3000);

	}

	@SneakyThrows
	@KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
	public void sendEmail(@Payload Payment payment) {
		Thread.sleep(3000);
		log.info("Enviando e-mail de confirmação da transação no cartão: {}, id: {}", payment.getCardNumber(), payment.getId());

	}
}
