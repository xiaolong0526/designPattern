package com.xiaolong.principle.inversion;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 15:47
 */

/**
 * 依赖反转
 */
public class DependecyInversion {

    public static void main(String[] args) {
        // 需求：定义一个person类完成接受消息功能
        Person person = new Person();
        person.receive(new Email());



    }
}

/**
 * 定义一个person类
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

/**
 * 定义一个email类
 */
class Email{
    public String getInfo(){
        return "电子邮件消息：hello world";
    }
}