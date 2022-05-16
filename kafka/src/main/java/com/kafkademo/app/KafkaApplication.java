package com.kafkademo.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@ComponentScan(basePackages = "com.kafkademo")
public class KafkaApplication { public static void main(String[] args) {
	SpringApplication.run(KafkaApplication.class, args);
	}
}
