package kafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProducerApplication  {

	
	
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}


}
