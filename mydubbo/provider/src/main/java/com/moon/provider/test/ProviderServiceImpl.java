package com.moon.provider.test;

/**
 * @program: mydubbo
 * @description:
 * @create: 2021-09-03 14:07
 **/

import com.moon.myapi.providerApi.ProviderService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String test (String msg) {
        System.out.println("~~~~~~服务 提供者调用~~~~~");
        return "来自服务提供者的消息 ："+msg;
    }
}
