package com.xiaolong.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 17:17
 */

//University就是composite , 可以管理College
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("=====" + getName() + "=====");
        // 遍历organizationComponent
        for (OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponent.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponent.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public String getDes() {
        return super.getDes();
    }

}
