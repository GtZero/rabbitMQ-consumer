//package com.guotao.rabbitmq.rabbit;
//
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.core.MessageProperties;
//import org.springframework.amqp.rabbit.connection.CorrelationData;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.MessageHeaders;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Component;
//
//import java.util.Map;
//import java.util.UUID;
//
//@Component
//public class BootProducter {
//
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    public final static RabbitTemplate.ConfirmCallback confirmCallback = new RabbitTemplate.ConfirmCallback() {
//        @Override
//        public void confirm(CorrelationData correlationData, boolean b, String s) {
//            System.out.println(correlationData);
//            System.out.println("ack : " + b);
//            System.out.println(s);
//        }
//    };
//
//    public final static RabbitTemplate.ReturnCallback returnCallback = new RabbitTemplate.ReturnCallback() {
//        @Override
//        public void returnedMessage(Message message, int i, String s, String s1, String s2) {
//            System.out.println("return message" + message.getBody());
//        }
//    };
//
//    public void sendMessage(Object body, Map<String, Object> properties) throws Exception {
//        MessageHeaders messageHeaders = new MessageHeaders(properties);
//        org.springframework.messaging.Message<Object> message = MessageBuilder.createMessage(body, messageHeaders);
//        rabbitTemplate.setMandatory(true);
//        rabbitTemplate.setConfirmCallback(confirmCallback);
//        rabbitTemplate.setReturnCallback(returnCallback);
//        CorrelationData correlationData = new CorrelationData();
//        correlationData.setId(UUID.randomUUID().toString());
//        System.out.println("1111");
//        rabbitTemplate.convertAndSend("gt-exchange", "gt.abc", message, correlationData);
//    }
//
//}
