package com.guotao.rabbitmq.rabbit;

import org.springframework.amqp.support.converter.DefaultClassMapper;

public class RabbitMqFastJsonClassMapper extends DefaultClassMapper {
    /**
     * 构造函数初始化信任所有pakcage
     */
    public RabbitMqFastJsonClassMapper() {
        super();
        setTrustedPackages("*");
    }
}