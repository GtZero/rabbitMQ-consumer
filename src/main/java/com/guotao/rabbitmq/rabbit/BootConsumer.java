package com.guotao.rabbitmq.rabbit;

//import com.guotao.amqp.procuder.User;
import com.rabbitmq.client.Channel;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;

import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component
@RabbitListener(queues = "gt-queue", containerFactory = "rabbitListenerContainerFactory")
//@RabbitListener(queues = "gt-queue", containerFactory = "rabbitListenerContainerFactory")
public class BootConsumer {

    @RabbitHandler
    public void consumer(@Payload com.guotao.amqp.procuder.User user, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag) throws IOException {
        System.out.println("this is arg user what " + user + deliveryTag);
        channel.basicAck(deliveryTag, false);
    }

    @RabbitHandler
    public void consumer(@Payload User user, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag) throws IOException {
        System.out.println("this is arg user what " + user + deliveryTag);
        channel.basicAck(deliveryTag, false);
    }

    @RabbitHandler
    public void consumer(@Payload Map user, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag) throws IOException {
        System.out.println("this is arg map" + user);
        channel.basicAck(deliveryTag, false);
    }

    @RabbitHandler
    public void consumer(@Payload String message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag) throws IOException {
        System.out.println("this is arg String " + message);
        channel.basicAck(deliveryTag, false);
    }

//        @RabbitHandler
//    public void consumer(Message m, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag) throws IOException {
//        System.out.println("this is arg String " + m.getBody());
//        channel.basicAck(deliveryTag, false);
//    }

//    @RabbitHandler
//    public void consumerMessing(org.springframework.messaging.Message message, Channel channel) throws IOException {
//        System.out.println("this body is " + message.getPayload());
//        System.out.println(message.getHeaders());
//        Long deliveryTag = (Long) message.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
//        channel.basicAck(deliveryTag, false);
//    }

//    @RabbitHandler
//    public void consumer(org.springframework.amqp.core.Message message, Channel channel) throws IOException {
//        System.out.println("this amqp core message body " + new java.lang.String(message.getBody()));
//        System.out.println(message.getMessageProperties().getDeliveryTag());
////        System.out.println("this body is " + message.getPayload());
////        System.out.println(message.getHeaders());
////        Long deliveryTag = (Long) message.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
//    }

//    @RabbitHandler
//    public void consumer2(@Payload byte[] message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag) throws IOException {
//        System.out.println("this is arg byte" + new String(message));
//        channel.basicAck(deliveryTag, false);
////        System.out.println("this body is " + message.getPayload());
////        System.out.println(message.getHeaders());
////        Long deliveryTag = (Long) message.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
////        channel.basicAck(deliveryTag, false);
//    }

    @RabbitHandler
    public void consumer4(Integer message) throws IOException {
        System.out.println("this is arg Integer" + message);
//        System.out.println("this body is " + msg.getPayload());
//        System.out.println(msg.getHeaders());
//        Long deliveryTag = (Long) msg.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
//        System.out.println(deliveryTag);
//        channel.basicAck(deliveryTag, false);
    }
}
