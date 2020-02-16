//package com.guotao.rabbitmq.rabbit;
//
//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.ConnectionFactory;
//import com.rabbitmq.client.MessageProperties;
//
//import java.io.IOException;
//import java.util.concurrent.TimeoutException;
//
//public class Producer {
//    public static void main(String[] args) throws IOException, TimeoutException {
//        // 1. 创建连接工厂
//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        connectionFactory.setHost("129.204.206.191");
//        connectionFactory.setPort(5672);
//        connectionFactory.setVirtualHost("/");
//        // 2. 连接工厂 创建 连接
//        Connection connection = connectionFactory.newConnection();
//        // 3. 连接 获取 信道
//        Channel channel = connection.createChannel();
//        // 4. Channel发送消息
//        for (int i = 0; i < 5; i++) {
//            String msg = "hello world";
////            MessageProperties
//            channel.basicPublish("", "test001", null, msg.getBytes());
//        }
//        channel.close();
//        connection.close();
//    }
//}
