package kafkaProducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner {

	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		kafkaTemplate.send("quickstart-events-new"," Hello from Spring ----> ");
	}

}
