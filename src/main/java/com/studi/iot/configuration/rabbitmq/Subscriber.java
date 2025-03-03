package com.studi.iot.configuration.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Subscriber {
  

  @RabbitListener(queues = "ampoule")
  public void receiveMessage(String message) {
    System.out.println("Super ! J'ai reçu " + message);
  }
}
