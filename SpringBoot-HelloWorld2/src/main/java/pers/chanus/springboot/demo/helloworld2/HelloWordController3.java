/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: HelloWordController3
 * Author:   Chanus
 * Date:     2020/4/6 20:15
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo.helloworld2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/6 20:15
 * @since 1.0.0
 */
@RestController
public class HelloWordController3 {
    @RequestMapping("hello3")
    public String hello3() {
        return "Hello World3!";
    }
}
