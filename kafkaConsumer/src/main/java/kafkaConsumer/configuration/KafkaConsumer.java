package kafkaConsumer.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;


@Configuration
public class KafkaConsumer {

	
	@Bean
	public ConsumerFactory<String, String> consumerFactory(){
		
		Map<String,Object> map = new HashMap<>();
		map.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:90992");
		map.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		map.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		
		
		return  new DefaultKafkaConsumerFactory<>(map);
	}
	
	
	   public ConcurrentKafkaListenerContainerFactory<String, String> concurrentKafkaListenerContainerFactory()
	    {
	        ConcurrentKafkaListenerContainerFactory<  String, String> factory= new ConcurrentKafkaListenerContainerFactory<>();
	        factory.setConsumerFactory(consumerFactory());
	        return factory;
	    }
}
