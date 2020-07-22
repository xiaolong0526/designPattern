package com.xiaolong.pattern.composite;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 17:11
 */

/**
 * 组合模式
 */

public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "number 1");

        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");

        computerCollege.add(new Department("软件工程", "good" ));

        university.add(computerCollege);


    }



}
