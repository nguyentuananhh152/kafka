package com.ms.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author tuananh
 * @version 0.0.1
 * @date 21/08/2024
 */
@Component
public class KafkaListeners {

	@KafkaListener(
			topics = "ms",
						  groupId = "groupId"
	)
	void listener(String data) {
		System.out.println("Listener received: " + data);
	}
}
