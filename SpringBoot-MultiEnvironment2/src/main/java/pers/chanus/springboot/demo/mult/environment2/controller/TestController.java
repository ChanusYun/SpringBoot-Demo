/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: TestController
 * Author:   Chanus
 * Date:     2020/4/7 22:35
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo.mult.environment2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/7 22:35
 * @since 1.0.0
 */
@RestController
public class TestController {
    @Value("${name}")
    private String name;

    @RequestMapping("test")
    public String test() {
        return "当前环境：" + name;
    }
}
