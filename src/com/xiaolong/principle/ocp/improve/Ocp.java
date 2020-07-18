package com.xiaolong.principle.ocp.improve;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 21:32
 */

/**
 * 方式1违反了ocp原则：即给类新增加功能时，尽量不修改代码，或者少修改代码
 * 修改思路：把使用方中的绘制方法剔除掉，放到shape基类中
 * 也就是
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Rectangle());
        // 新增一图形：可以看出，使用方这里并没有修改代码
        graphicEditor.drawShape(new OtherShape());

    }
}

//绘制图形：使用方
class GraphicEditor {
    public void drawShape(Shape s){
        s.draw();
    }
}

//将基类修改成抽象类，并添加一个绘制方法，让子类去继承
abstract class Shape{
    int m_type;
    abstract void draw();
}

class Circle extends Shape{
    public Circle() {
        super.m_type = 2;
    }

    @Override
    void draw() {
        System.out.println("绘制圆形");
    }
}

class Rectangle extends Shape{
    public Rectangle() {
        super.m_type = 1;
    }

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

class Triangle extends Shape{
    public Triangle() {
        super.m_type = 3;
    }

    @Override
    void draw() {
        System.out.println("绘制三角形");
    }
}

// 新增一个图形
class OtherShape extends Shape{
    public OtherShape() {
        super.m_type = 4;
    }

    @Override
    void draw() {
        System.out.println("新增图形");
    }
}