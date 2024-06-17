package com.happy.coding.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	@Value("${spring.kafka.topic.name}")
	private String topicName;
	@Value("${spring.kafka.topic-json.name}")
	private String topiJsoncName;

	public NewTopic sharwanCreatedTopic() {
		return TopicBuilder.name("sharwanTopic").build();
	}

	public NewTopic sharwanJsonCreatedTopic() {
		return TopicBuilder.name(topiJsoncName).build();
	}
}
