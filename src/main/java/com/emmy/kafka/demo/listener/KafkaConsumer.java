package com.emmy.kafka.demo.listener;

import com.emmy.kafka.demo.model.User;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics ="Kafka_example", groupId = "group_id" )
    public void consume (String message){
        System.out.println("consumed message : "+ message);
    }

    @KafkaListener(topics ="Kafka_example_json", groupId = "group_json" , containerFactory = "kafkaListenerContainerFactoryUser")
    public void consumeJson (User user){
        System.out.println("consumed message : "+ user);
    }
}
