/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: HelloWorldController1
 * Author:   Chanus
 * Date:     2020/4/6 20:09
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo.helloworld2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/6 20:09
 * @since 1.0.0
 */
@RestController
public class HelloWorldController1 {
    @RequestMapping("hello1")
    public String hello1() {
        return "Hello World1!";
    }
}
