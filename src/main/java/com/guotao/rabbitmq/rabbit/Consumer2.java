//package com.guotao.rabbitmq.rabbit;
//
//import com.rabbitmq.client.*;
//
//import java.io.IOException;
//import java.util.concurrent.TimeoutException;
//
//public class Consumer2 {
//    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
//        // 1. 创建连接工厂
//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        connectionFactory.setHost("129.204.206.191");
//        connectionFactory.setPort(5672);
//        connectionFactory.setVirtualHost("/");
//        // 2. 连接工厂 创建 连接
//        Connection connection = connectionFactory.newConnection();
//        // 3. 连接 获取 信道
//        Channel channel = connection.createChannel();
//        // 4. 创建一个队列
//        String queueName = "test001";
////        channel.queueDeclare(queueName, true, false, false, null);
//        // 5. 创建消费者
//        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
//            @Override
//            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
//                System.out.println("消息内容:" + new String(body));
//            }
//        };
//
////        channel.basicc
//    }
//}
