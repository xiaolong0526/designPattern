package com.xiaolong.pattern.prototype;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:01
 */

/**
 * 原型模式
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");

        // 复制
        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

    }
}

class Sheep {

    private String name;
    private Integer age;
    private String color;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}