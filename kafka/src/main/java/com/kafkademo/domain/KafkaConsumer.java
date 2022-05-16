package com.kafkademo.domain;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  @KafkaListener(topics = "quickstart-events")
  public void consume(String event) {
    System.out.println(event);
  }
}
