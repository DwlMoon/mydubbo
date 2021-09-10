package com.moon.consumer.test;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
@RequestMapping("shop")
@Slf4j
public class ConsumerController {


    @Autowired
    ConsumerService consumerService;


    /**
     * 客户端拉取账户数据
     *
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "getData", method = {RequestMethod.GET})
    public ResultBean<String> getData () throws IOException {
        ResultBean<String> test = consumerService.test("你是谁？");
        return test;

    }


}
