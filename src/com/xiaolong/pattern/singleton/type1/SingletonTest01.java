package com.xiaolong.pattern.singleton.type1;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 12:28
 */


public class SingletonTest01 {
    public static void main(String[] args) {
        // 测试
        Singleton instance = Singleton.getInstance();
    }
}

//饿汉式（静态变量）

/**
 * 优点：实现简单，在类装载的时候就完成了实例化，避免了线程同步问题
 * 缺点： 如何从头到尾没有用到这个实例，则会造成内存浪费
 */
class Singleton {

    // 构造方法私有化，外部不能new
    private Singleton() {
    }
    // 内部创造对象实例
    private static final Singleton instance = new Singleton();

    // 对外暴露一个公共的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}