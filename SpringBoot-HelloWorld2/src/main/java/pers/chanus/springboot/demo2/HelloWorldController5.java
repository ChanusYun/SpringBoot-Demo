/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: HelloWorldController5
 * Author:   Chanus
 * Date:     2020/4/6 21:18
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/6 21:18
 * @since 1.0.0
 */
@RestController
public class HelloWorldController5 {
    @RequestMapping("hello5")
    public String hello5() {
        return "Hello World5!";
    }
}
