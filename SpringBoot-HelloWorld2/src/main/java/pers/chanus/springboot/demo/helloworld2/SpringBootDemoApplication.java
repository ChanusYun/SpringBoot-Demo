/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: SpringBootDemoApplication
 * Author:   Chanus
 * Date:     2020/4/6 20:04
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo.helloworld2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot启动项目
 * @SpringBootApplication 注解默认扫描当前包及子包中的Bean，作用等价于同时组合使用@EnableAutoConfiguration，@ComponentScan，@SpringBootConfiguration
 * @SpringBootConfiguration 继承@Configuration注解，用来声明当前类是一个配置类，可以通过＠Bean注解生成IOC容器管理的bean
 * @EnableAutoConfiguration 能够自动配置spring的上下文，试图猜测和配置你想要的bean类，通常会自动根据你的类路径和你的bean定义自动配置
 * @ComponentScan 会自动扫描指定包下的全部标有@Component的类，并注册成bean，当然包括@Component下的子注解@Service,@Repository,@Controller
 *
 * @author Chanus
 * @date 2020/4/6 20:04
 * @since 1.0.0
 */
// @SpringBootApplication
@EnableAutoConfiguration
@SpringBootConfiguration
@ComponentScan({"pers.chanus.springboot","com.chanus.controller"})
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
