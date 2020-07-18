package com.xiaolong.principle.inversion;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 15:55
 */

/**
 * 定义一个类对DependcyInversion进行改进
 * 存在的问题：person接受的消息固定了，只能接受email消息，当需要接受微信消息时，就需要新增类，同时person也要增加相应的接受方法
 * 解决策略：定义一个抽象的接口，表示接受者，这样person也接口发生依赖；
 * 好处：weixin和eamil属于接受者范围，各自实现接口，就符合依赖倒转原则
 */
public class DependecyInversionImporve {
    public static void main(String[] args) {
        //这里通过一个接口，接口接受的消息就可以进行扩展
        Person2 person = new Person2();
        person.receive(new Email2());
        person.receive(new Weixin());

    }
}

class Person2{
    //这里是对接口的依赖
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}

interface IReceiver{
    String getInfo();
}

class Email2 implements IReceiver{

    @Override
    public String getInfo() {
        return "邮箱消息：hello 邮箱";
    }
}

class Weixin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信消息：hello 微信";
    }
}

