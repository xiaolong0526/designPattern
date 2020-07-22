package com.xiaolong.pattern.builder.improve;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:40
 */

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("地基10米");
    }

    @Override
    public void buildWalls() {
        System.out.println("砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("透明屋顶");
    }
}
