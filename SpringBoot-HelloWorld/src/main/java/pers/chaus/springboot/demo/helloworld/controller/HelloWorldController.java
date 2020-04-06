/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: HelloWorldController
 * Author:   Chanus
 * Date:     2020/4/6 16:12
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chaus.springboot.demo.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 入门级SpringBoot示例，向页面返回"Hello World!"
 *
 * @author Chanus
 * @date 2020/4/6 16:12
 * @since 1.0.0
 */
@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String hello() {
        return "Hello World!";
    }
}
