package com.xiaolong.principle.liskov.improve;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 21:06
 */

/**
 * 里氏原则：在子类中通过修改父类的方法实现新功能，虽然实现简单，但是整个继承体系的复用性会比较差
 * 改进方法：把原来的继承关系去掉，原来的子类和父类继承一个更通俗的基类，原来的继承关系采用依赖，组合，聚合等关系代替
 */
public class Liskov {
    public static void main(String[] args) {

    }
}

class Base{
    // 更加基础的方法和成员写到Base类中
}
class A{
    public int function1(int num1, int num2){
        return num1 - num2;
    }
}

class B extends Base{
    //采用组合的方式
    private A a = new A();

    public int function1(int num1, int num2){
        return num1 + num2;
    }

    // 使用类A中的方法
    public int function2(int num1, int num2){
        return a.function1(num1, num2);
    }
}
