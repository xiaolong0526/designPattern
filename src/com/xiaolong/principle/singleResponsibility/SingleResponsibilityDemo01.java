package com.xiaolong.principle.singleResponsibility;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/18 12:14
 */

/**
 * 单例原则
 */
public class SingleResponsibilityDemo01 {
    public static void main(String[] args) {
        //这里就存在问题：一个类中实现了多个功能，需要把类细粒度化，分成天上，地上，水上
        Vehilce vehilce = new Vehilce();
        vehilce.run("飞机");
        vehilce.run("小汽车");
        // 根据单例原则进行修改类
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
        // 根据单例原则修改类中方法
        VehicleVersion2 vehicleVersion2 = new VehicleVersion2();
        vehicleVersion2.run("小汽车");
        vehicleVersion2.airRun("飞机");
        vehicleVersion2.waterRun("轮船");
    }
}

/**
 * 交通工具类
 */
class Vehilce{
    public void run(String vehicle){
        System.out.println(vehicle + "正在公路上行驶");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天上飞");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水上行驶");
    }
}

class VehicleVersion2{
    public void run(String vehicle){
        System.out.println(vehicle + "正在公路上行驶");
    }
    public void airRun(String vehicle){
        System.out.println(vehicle+ "在天上飞");
    }
    public void waterRun(String vehicle){
        System.out.println(vehicle + "在水上行驶");
    }
}
