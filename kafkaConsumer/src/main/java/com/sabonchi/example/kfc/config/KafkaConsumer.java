package com.sabonchi.example.kfc.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.sabonchi.example.kfc.data.Credentail;


@Configuration
public class KafkaConsumer {
	@Bean
	public ConsumerFactory<String, Credentail> consumerFactory(){
		
		Map<String,Object> map = new HashMap<>();
		map.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:90992");
		map.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		map.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
		return  new DefaultKafkaConsumerFactory<>(map);
	}
	
	
	  @Bean
	   public ConcurrentKafkaListenerContainerFactory<String, Credentail> concurrentKafkaListenerContainerFactory()
	    {
	        ConcurrentKafkaListenerContainerFactory<  String, Credentail> factory= new ConcurrentKafkaListenerContainerFactory<>();
	        factory.setConsumerFactory(consumerFactory());
	        return factory;
	    }
}
