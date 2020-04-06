/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: HelloWorldController6
 * Author:   Chanus
 * Date:     2020/4/6 21:23
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package com.chanus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/6 21:23
 * @since 1.0.0
 */
@RestController
public class HelloWorldController6 {
    @RequestMapping("hello6")
    public String hello6() {
        return "Hello World6!";
    }
}
