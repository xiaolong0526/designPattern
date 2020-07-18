package com.xiaolong.principle.liskov;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 21:03
 */

/**
 * 里式原则
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        a.function1(10,1);
        B b = new B();
        //这里原本是向计算10-2；但是B继承A中，无意重写了A中的function1方法，造成是计算10+2
        b.function1(10,2);
    }
}


class A{
    public int function1(int num1, int num2){
        return num1 - num2;
    }
}

class B extends A{


    @Override
    public int function1(int num1, int num2) {
        return num1 + num2;
    }
}