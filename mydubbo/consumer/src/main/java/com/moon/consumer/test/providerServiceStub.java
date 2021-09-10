package com.moon.consumer.test;

import com.moon.myapi.providerApi.ProviderService;
import org.apache.dubbo.common.utils.StringUtils;

/**
 * @program: mydubbo
 * @description: 接口服务存根
 * @create: 2021-09-10 16:37
 **/

public class providerServiceStub implements ProviderService {


    private final ProviderService providerService;

    /**
     * 传入的 providerService 的远程代理对象
     * @param providerService
     */
    public providerServiceStub (ProviderService providerService) {
        this.providerService = providerService;
    }


    @Override
    public String test (String msg) {
        System.out.println("本地存根被调用");
        if (StringUtils.isNotEmpty(msg)){
            return providerService.test(msg);
        }
        return null;
    }
}
