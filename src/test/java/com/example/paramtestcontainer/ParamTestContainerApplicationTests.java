package com.example.paramtestcontainer;

import com.playtika.test.rabbitmq.EmbeddedRabbitMQBootstrapConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

@SpringBootTest
@Import({EmbeddedRabbitMQBootstrapConfiguration.class})
@Slf4j
class ParamTestContainerApplicationTests {


	@Value("${embedded.rabbitmq.host}")
	private String host;

	@Value("${embedded.rabbitmq.port}")
	private String port;

	@Autowired
	private MessageChannel testStream;

	@Test
	void contextLoads() {

		log.info("Host: {}, Port: {}", host, port);

		testStream.send(new GenericMessage("Hello World testing using TestContainer and RMQ"));
	}

}
