package com.xiaolong.pattern.iterator;

import java.util.Iterator;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 21:24
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {

        departments = new Department[5];
        addDepartment("Java专业", "Java专业");
        addDepartment("大数据专业", "大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
