//package com.guotao.rabbitmq;
//
//
//import com.guotao.rabbitmq.rabbit.BootProducter;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.amqp.rabbit.connection.CorrelationData;
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class MainConfig {
//
//    @Bean
//    public ConnectionFactory connectionFactory(){
//        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
//        connectionFactory.setAddresses("129.204.206.191");
//        connectionFactory.setUsername("guest");
//        connectionFactory.setPassword("guest");
//        connectionFactory.setVirtualHost("/");
//        connectionFactory.setPublisherReturns(true);
//        connectionFactory.setPublisherConfirms(true);
//        return connectionFactory;
//    }
//
//
//}
