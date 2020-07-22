package com.xiaolong.pattern.template;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 20:21
 */

/**
 * 抽象类：表示豆浆
 */
public abstract class SoyaMilk {

    // 模板方法，final：不让子类覆盖
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    // 选材料
    void select() {
        System.out.println("第一步：选好新鲜黄豆");
    }

    // 添加不同的配料，抽象方法，子类具体实现
    abstract void addCondiments();

    void soak() {
        System.out.println("第三步： 黄豆和配料开始浸泡，需要3小时");
    }

    void beat() {
        System.out.println("第四步： 材料打碎");
    }
}
