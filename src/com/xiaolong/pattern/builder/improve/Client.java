package com.xiaolong.pattern.builder.improve;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:31
 */

/**
 * 建造者模式进行改进：
 *
 */
public class Client {
    public static void main(String[] args) {
        //产品
        HighBuilding highBuilding = new HighBuilding();
        //指挥者
        HouseDirector houseDirector = new HouseDirector(highBuilding);
        //返回产品
        houseDirector.constructHouse();
    }
}
