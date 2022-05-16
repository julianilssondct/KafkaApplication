package com.kafkademo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProduceServiceImpl implements ProduceService {

  @Autowired
  private KafkaTemplate<String, String> template;

  @Override
  public void produce(String event) {
    template.send("quickstart-events", event);
  }
}
