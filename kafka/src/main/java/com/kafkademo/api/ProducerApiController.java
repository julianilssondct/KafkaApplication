package com.kafkademo.api;

import com.kafkademo.domain.ProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1")
public class ProducerApiController {

  @Autowired
  public ProduceService producer;

  @PostMapping(value = "/produce")
  public ResponseEntity<?> produce(@RequestBody String event) {
    producer.produce(event);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
