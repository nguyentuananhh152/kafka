package com.ms.ctrl;

import com.ms.dto.MessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tuananh
 * @version 0.0.1
 * @date 21/08/2024
 */
@RestController
@RequestMapping("/api/v1/message")
public class MessageCtrl {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@PostMapping
	public void publish(@RequestBody MessageDto request) {
		kafkaTemplate.send("ms", request.getMessage());

	}
}
