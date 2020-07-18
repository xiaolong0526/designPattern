package com.xiaolong.principle.inversion;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 16:17
 */

/**
 * 依赖传递有三种方式：
 * 1：接口传递
 * 2：构造方法传递
 * 3：setter传递
 */
public class DependecyPass {

    public static void main(String[] args) {

    }
}

/**
 * 方法1：通过接口传递依赖
 */
interface IopenAndClose{
    //抽象方法，接受接口
    void open(ITv tv);
}
interface ITv{
    void play();
}
//实现接口
class OpenAndClose implements IopenAndClose{

    @Override
    public void open(ITv tv) {
        tv.play();
    }
}
/**
 * 方法2：通过构造方法传递依赖(比较好）
 */
interface IopenAndClose2{
    void open();
}
interface ITv2{
    void play();
}
class OpenAndClose2 implements IopenAndClose2{
    private ITv2 iTv2;
    //通过构造方法传递ITV2的依赖
    public OpenAndClose2(ITv2 iTv2){
        this.iTv2 = iTv2;
    }

    @Override
    public void open() {
        this.iTv2.play();
    }
}

/**
 * 方法3：通过setter方法传递依赖
 */
interface IopenAndClose3{
    void open();
    void setTv3(ITv3 iTv3);
}
interface ITv3{
    void play();
}
class OpenAndClose3 implements IopenAndClose3{

    private ITv3 iTv3;

    //通过setter方法传递ITV2的依赖
    @Override
    public void setTv3(ITv3 iTv3) {
        this.iTv3 = iTv3;
    }

    @Override
    public void open() {
        this.iTv3.play();
    }


}