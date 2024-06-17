package com.happy.coding.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.happy.coding.payload.User;

@Service
public class JsonKafkaConsumer {
	private static Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

@KafkaListener(topics="${spring.kafka.topic-json.name}",groupId="${spring.kafka.consumer.group-id}")
	public void consume(User user) {
		LOGGER.info(String.format("Json message recieved ->  %s", user.toString()));
	}
}
