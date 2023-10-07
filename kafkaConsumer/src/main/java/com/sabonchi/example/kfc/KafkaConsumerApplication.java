package com.sabonchi.example.kfc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;

import com.sabonchi.example.kfc.data.Credentail;


@SpringBootApplication
public class KafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaConsumerApplication.class, args);
	}
	
	
	/*
	 *  To view the port number
	 * bin/kafka-consumer-groups.sh --all-topics --bootstrap-server localhost:9092  --list
	 */
	
	
	/*
	 * make sure payload of type string
	 */
	@KafkaListener(topics = "quickstart-events-new", groupId = "console-consumer-22234")
	public void listner(@Payload String  credentail) {
				
		System.out.println(credentail);
		
		
	}

}
