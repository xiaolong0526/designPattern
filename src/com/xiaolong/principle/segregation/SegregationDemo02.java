package com.xiaolong.principle.segregation;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 13:55
 */

/**
 * 根据接口隔离原则对SegregationDemo01进行改进
 * 类A通过接口Inte依赖类B,但是类B中有类A不使用的方法，那么接口Inte对于类A来说不是最小接口，类B必须去实现他们不需要的方法
 * 改进方案：将接口Inte拆分为独立的几个接口，类A和类C分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则
 */
public class SegregationDemo02 {

    public static void main(String[] args) {

    }
}


/**
 * 将接口拆分成三个接口
 */
interface Inte1{
    void function1();
}

interface Inte2{
    void function2();
    void function3();
}

interface Inte3{
    void function4();
    void function5();
}

/**
 * B2类分别实现接口Inte1和Inte2
 */
class B2 implements Inte1, Inte2{

    @Override
    public void function1() {
        System.out.println("B2实现了Inte1的方法1");
    }

    @Override
    public void function2() {
        System.out.println("B2实现了Inte2的方法2");
    }

    @Override
    public void function3() {
        System.out.println("B2实现了Inte2的方法3");
    }
}

class A2{
    public void depend1(Inte1 inte){
        inte.function1();
    }

    public void depend2(Inte2 inte){
        inte.function2();
    }

    public void depend3(Inte2 inte){
        inte.function3();
    }
}
/**
 * B2类分别实现接口Inte1和Inte3
 */
class D2 implements Inte1, Inte3{

    @Override
    public void function1() {
        System.out.println("D2实现了Inte1的方法1");
    }

    @Override
    public void function4() {
        System.out.println("D2实现了Inte3的方法1");
    }

    @Override
    public void function5() {
        System.out.println("D2实现了Inte3的方法2");
    }
}

class C2{
    public void depend1(Inte1 inte){
        inte.function1();
    }

    public void depend2(Inte3 inte){
        inte.function4();
    }

    public void depend3(Inte3 inte){
        inte.function5();
    }
}