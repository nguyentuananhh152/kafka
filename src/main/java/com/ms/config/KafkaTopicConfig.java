package com.ms.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author tuananh
 * @version 0.0.1
 * @date 21/08/2024
 */
@Configuration
public class KafkaTopicConfig {

	@Bean
	public NewTopic msTopic() {
		return TopicBuilder.name("sm").build();
	}
}
