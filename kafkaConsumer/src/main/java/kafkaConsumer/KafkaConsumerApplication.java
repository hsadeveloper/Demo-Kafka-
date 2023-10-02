package kafkaConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}
	
	
	@KafkaListener(topics = "quickstart-events-new", groupId = "console-consumer-22234")
	public void listner(@Payload String message) {
		
		
		System.out.println(message);
		
		
	}

}
