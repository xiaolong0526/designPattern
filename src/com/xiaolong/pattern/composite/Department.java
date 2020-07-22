package com.xiaolong.pattern.composite;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 17:22
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    // ADD, REMOVE 就不需要写了，因为是叶子节点
    @Override
    protected void print() {
        System.out.println(getName());
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
