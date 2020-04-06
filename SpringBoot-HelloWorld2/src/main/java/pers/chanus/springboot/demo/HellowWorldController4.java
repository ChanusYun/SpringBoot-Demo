/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: HellowWorldController4
 * Author:   Chanus
 * Date:     2020/4/6 20:17
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/6 20:17
 * @since 1.0.0
 */
@RestController
public class HellowWorldController4 {
    @RequestMapping("hello4")
    public String hello4() {
        return "Hello World4!";
    }
}
