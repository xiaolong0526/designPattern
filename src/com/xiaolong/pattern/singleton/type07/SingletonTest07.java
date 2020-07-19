package com.xiaolong.pattern.singleton.type07;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 13:23
 */

/**
 * 枚举:
 *  优点：避免多线程同步问题，还能防止反序列化重新构建新的对象
 *  推荐使用
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
    }
}

// 使用枚举实现单例，推荐
enum Singleton {
    //属性
    INSTANCE;

    public void sayOk(){
        System.out.println("ok");
    }
}
