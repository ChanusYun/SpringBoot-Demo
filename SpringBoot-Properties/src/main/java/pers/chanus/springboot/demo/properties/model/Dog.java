/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: Dog
 * Author:   Chanus
 * Date:     2020/4/8 14:41
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo.properties.model;

/**
 * TODO
 *
 * @author Chanus
 * @date 2020/4/8 21:39
 * @since 1.0.0
 */
public class Dog {
    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name
                + ", age=" + age
                + "]";
    }
}
