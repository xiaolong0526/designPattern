package com.xiaolong.pattern.iterator;

import java.util.Iterator;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 21:21
 */
public interface College {

    public String getName();

    // 增加系的方法
    public void addDepartment(String name, String desc);

    // 返回一个迭代器，遍历
    public Iterator createIterator();
}
