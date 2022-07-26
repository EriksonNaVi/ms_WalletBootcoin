package com.bootcamp.yankiwallet.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.bootcamp.yankiwallet.events.Event;
import com.bootcamp.yankiwallet.events.OwnerWalletCreateEvent;

@Component
public class WalletBootcoinConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(WalletBootcoinConsumer.class);

	@KafkaListener(topics = "${topic.wallet.name:petition}", containerFactory = "kafkaListenerContainerFactory", groupId = "grupo1")
	public void consumer(Event<?> event) {
		if (event.getClass().isAssignableFrom(OwnerWalletCreateEvent.class)) {
			OwnerWalletCreateEvent ownerWalletCreateEvent = (OwnerWalletCreateEvent) event;
			LOGGER.info("The consumer receives the customer with Id={}, data={}", ownerWalletCreateEvent.getId(),
					ownerWalletCreateEvent.getData().toString());
		}

	}
}
