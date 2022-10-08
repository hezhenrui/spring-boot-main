package com.hezhenrui.learn17.module.demo.producer;

import cn.hutool.core.util.StrUtil;
import com.hezhenrui.learn17.common.entity.GCDemo;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hzr
 * @date 2021-05-18
 */
@RestController
@RequestMapping("rabbit")
public class RabbitProducer {

    private final AmqpTemplate amqpTemplate;

    public RabbitProducer(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @PostMapping("send")
    public void send() {
        GCDemo gcDemo;
        for (int i=0;i<100;i++){
            gcDemo = new GCDemo();
            gcDemo.setId(StrUtil.toString(i));
            amqpTemplate.convertAndSend("amq.direct", "queue.demo.test01", gcDemo);
            amqpTemplate.convertAndSend("amq.direct", "queue.demo.test02", gcDemo);
        }
    }
}