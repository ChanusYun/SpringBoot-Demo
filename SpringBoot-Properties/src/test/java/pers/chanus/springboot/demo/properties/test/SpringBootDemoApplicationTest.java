/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: SpringBootDemoApplicationTest
 * Author:   Chanus
 * Date:     2020/4/8 21:41
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo.properties.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import pers.chanus.springboot.demo.properties.model.Person;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/8 21:41
 * @since 1.0.0
 */
@SpringBootTest
public class SpringBootDemoApplicationTest {
    @Autowired
    private Person person;

    @Value("${s}")
    private String s;

    @Value("${person.user-name}")
    private String userName;

    /**
     * 注入列表形式（自动根据","分割）
     */
    @Value("#{'${s}'.split(',')}")
    private List<String> s2;

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
    void contextLoadsS() throws UnsupportedEncodingException {
        System.out.println("s = " + s);
        // *.properties文件中的中文默认以ISO-8859-1方式编码，因此需要对中文内容进行重新编码
        System.out.println("userName = " + new String(userName.getBytes("ISO-8859-1"), "UTF-8"));
        s2.stream().forEach(System.out::println);
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
