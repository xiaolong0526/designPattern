package com.xiaolong.principle.segregation;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 13:20
 */

/**
 * 接口隔离原则
 */
public class SegregationDemo01 {
    public static void main(String[] args) {

        //类A 通过接口依赖接口的实现类B
        A a = new A();
        a.depend1(new B());
        //类C 通过接口依赖接口的实现类C
        C c = new C();
        c.depend1(new D());
    }
}

/**
 * 定义一个接口
 */
interface Inte{
    void function1();
    void function2();
    void function3();
    void function4();
    void function5();
}

/**
 * 定义一个类B去实现接口
 */
class B implements Inte{

    @Override
    public void function1() {
        System.out.println("B实现了接口的方法1");
    }

    @Override
    public void function2() {
        System.out.println("B实现了接口的方法2");
    }

    @Override
    public void function3() {
        System.out.println("B实现了接口的方法3");
    }

    @Override
    public void function4() {
        System.out.println("B实现了接口的方法4");
    }

    @Override
    public void function5() {
        System.out.println("B实现了接口的方法5");
    }
}


/**
 * 定义一个类A：通过接口依赖B中的方法1,2,3（依赖就是使用的意思），注意：这里不依赖4,5方法
 */
class A{
    public void depend1(Inte inte){
        inte.function1();
    }

    public void depend2(Inte inte){
        inte.function2();
    }

    public void depend3(Inte inte){
        inte.function3();
    }
}

/**
 * 定义一个类实现接口
 */
class D implements Inte{

    @Override
    public void function1() {
        System.out.println("D实现了接口的方法1");
    }

    @Override
    public void function2() {
        System.out.println("D实现了接口的方法2");
    }

    @Override
    public void function3() {
        System.out.println("D实现了接口的方法3");
    }

    @Override
    public void function4() {
        System.out.println("D实现了接口的方法4");
    }

    @Override
    public void function5() {
        System.out.println("D实现了接口的方法5");
    }
}

/**
 * 定义一个类C：通过接口依赖D中的方法1,4,5(依赖就是使用的意思），注意：这里不依赖2,3方法
 */
class C{

    public void depend1(Inte inte){
        inte.function1();
    }

    public void depend4(Inte inte){
        inte.function4();
    }

    public void depend5(Inte inte){
        inte.function5();
    }
}