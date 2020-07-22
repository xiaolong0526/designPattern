package com.xiaolong.pattern.composite;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 17:12
 */


public abstract class OrganizationComponent {

    private String name; //名字
    private String des; // 说明

    protected void add(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }
    // 方法print, 抽象
    protected abstract void print();

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
