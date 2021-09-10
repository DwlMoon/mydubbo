package com.moon.consumer.test;

/**
 * @program: mydubbo
 * @description:
 * @create: 2021-09-03 14:07
 **/

import com.moon.myapi.providerApi.ProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {


    @DubboReference(version = "1.0.0" ,stub = "com.moon.consumer.test.providerServiceStub",loadbalance = "roundrobin")
    ProviderService providerService;


    @Override
    public ResultBean<String> test (String msg) {
        System.out.println("~~~~~~服务 消费者 上线~~~~~");
        String test = providerService.test(msg);
        return new ResultBean<>(test);
    }
}
