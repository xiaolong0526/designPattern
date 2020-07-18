package com.xiaolong.principle.ocp;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 21:16
 */

/**
 * 开闭原则
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

// 用于绘图的类：使用方
class GraphicEditor {
    // 接受shape,根据shape的type,绘制图形
    public void drawShape(Shape s){
        if (s.m_type == 1){
            drawRectangle(s);
        }else if (s.m_type == 2){
            drawCircle(s);
        }else if (s.m_type == 3){
            drawTriangle(s);
        }
    }

    private void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }


    private void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }

    private void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }
}

// Shape类，基类
class Shape {
    int m_type;
}
class Rectangle extends Shape{
    public Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape{
    public Circle() {
        super.m_type = 2;
    }
}
//新增三角形：需要修改较多的代码
class Triangle extends Shape{
    public Triangle() {
        super.m_type = 3;
    }
}