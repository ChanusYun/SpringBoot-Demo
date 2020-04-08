/*
 * Copyright (c), 2020-persent, Chanus and/or its affiliates. All rights reserved.
 * FileName: User
 * Author:   Chanus
 * Date:     2020/4/8 10:32
 * Description: TODO
 * History:
 * <author>          <time>          <version>          <desc>
 */
package pers.chanus.springboot.demo.properties.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的属性映射到这个组件
 * @ConfigurationProperties 告诉Spring Boot将本类中的所有属性和配置文件中相关的属性进行绑定
 *
 * @author Chanus
 * @date 2020/4/8 21:38
 * @since 1.0.0
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private Integer id;

    private String userName;

    private String sex;

    private Date birthday;

    private Boolean work;

    private String[] interest;

    private List<Object> list;

    private Map<String, Object> map;

    private Dog dog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getWork() {
        return work;
    }

    public void setWork(Boolean work) {
        this.work = work;
    }

    public String[] getInterest() {
        return interest;
    }

    public void setInterest(String[] interest) {
        this.interest = interest;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person [id=" + id
                + ", userName=" + userName
                + ", sex=" + sex
                + ", birthday=" + birthday
                + ", work=" + work
                + ", interest=" + interest
                + ", list=" + list
                + ", map=" + map
                + ", dog=" + dog
                + "]";
    }
}
