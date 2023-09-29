package kafkaProducer.configuration;

import java.util.HashMap;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration

public class PublisherConfig {
	
	
	@Bean
	public ProducerFactory<String, String> producerFactory( ){
		
		HashMap <String, Object> map = new HashMap();
		
		map.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		
		map.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		map.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		
		
		return new DefaultKafkaProducerFactory<>(map);
	}
	
	

	@Bean
	public KafkaTemplate<String, String> kafkaTemplate( ){
			
		return new KafkaTemplate <> (producerFactory());
		
	}
	

}
