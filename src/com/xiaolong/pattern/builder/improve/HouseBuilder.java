package com.xiaolong.pattern.builder.improve;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:33
 */

/**
 * 抽象的建造者
 */
public abstract class HouseBuilder {


    protected House house = new House();


    // 打地基
    public abstract void buildBasic();

    //砌墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    // 建造房子后，将产品返回
    public House buildHouse(){
        return house;
    }
}
