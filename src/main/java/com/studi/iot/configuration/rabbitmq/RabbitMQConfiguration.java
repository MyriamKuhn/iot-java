package com.studi.iot.configuration.rabbitmq;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfiguration {

  @Value("${rabbit.EXCHANGE_NAME}")
  String exchange;

  @Value("${rabbit.ROUTING_KEY_NAME}")
  String routingKey;
  
}
