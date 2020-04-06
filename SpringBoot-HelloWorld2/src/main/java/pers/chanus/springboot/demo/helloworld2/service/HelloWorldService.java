/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: HelloWorldService
 * Author:   Chanus
 * Date:     2020/4/6 20:12
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo.helloworld2.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/6 20:12
 * @since 1.0.0
 */
@RestController
public class HelloWorldService {
    @RequestMapping("hello2")
    public String hello2() {
        return "Hello World2!";
    }
}
