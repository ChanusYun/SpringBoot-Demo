/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: SpringBootDemoApplicationTest
 * Author:   Chanus
 * Date:     2020/4/8 14:45
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo.ymal.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import pers.chanus.springboot.demo.ymal.model.Person;

import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/8 14:45
 * @since 1.0.0
 */
@SpringBootTest
public class SpringBootDemoApplicationTest {
    @Autowired
    private Person person;

    @Value("${s}")
    private String s;

    @Value("${person.userName}")
    private String userName;

    /**
     * 注入普通字符串，相当于直接给属性默认值
     */
    @Value("Chanus")
    private String chanus;

    /**
     * 注入列表形式（自动根据","分割）
     */
    @Value("#{'${s}'.split(',')}")
    private List<String> s2;

    /**
     *  注入操作系统属性
     */
    @Value("#{systemProperties['os.name']}")
    private String systemPropertiesName;

    /**
     * 注入表达式结果
     */
    @Value("#{ T(java.lang.Math).random() * 100.0 }")
    private double randomNumber;

    /**
     * 注入URL资源
     */
    @Value("http://www.baidu.com")
    private URL baidu;

    /**
     * 如果属性中未配置ip，则使用默认值
     */
    @Value("${ip:127.0.0.1}")
    private String ip;

    /**
     * 如果系统属性中未获取到port的值，则使用8888。
     */
    @Value("#{systemProperties['port']?:'8888'}")
    private String port;

    @Value("${a}")
    private String[] a;

    @Value("${a}")
    private List<String> list;

    @Value("${b}")
    private Boolean[] b;

    @Value("${f}")
    private Float[] f;

    @Value("${d}")
    private Integer[] d;

    @Value("${n}")
    private String n;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    void contextLoadsS() {
        System.out.println("s = " + s);
        System.out.println("userName = " + userName);
        System.out.println("chanus = " + chanus);
        s2.stream().forEach(System.out::println);
        System.out.println("systemPropertiesName = " + systemPropertiesName);
        System.out.println("randomNumber = " + randomNumber);
        System.out.println("baidu = " + baidu.toString());
    }

    @Test
    void contextLoadsDefault() {
        System.out.println("ip = " + ip);
        System.out.println("port = " + port);
    }

    @Test
    void contextLoadsA() {
        Arrays.stream(a).forEach(System.out::println);
        list.stream().forEach(System.out::println);
    }

    @Test
    void contextLoadsB() {
        Arrays.stream(b).forEach(System.out::println);
    }

    @Test
    void contextLoadsF() {
        Arrays.stream(f).forEach(System.out::println);
    }

    @Test
    void contextLoadsD() {
        Arrays.stream(d).forEach(System.out::println);
    }

    @Test
    void contextLoadsN() {
        if (n == null)
            System.out.println("n = null");
        else if ("".equals(n))
            System.out.println("n is empty");
        else
            System.out.println("n != null");
    }
}
