package com.xiaolong.pattern.template.improve;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 20:35
 */

// 抽象类：表示豆浆
public abstract class SoyaMilk {

    final void make() {
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
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

    // 钩子方法，决定是否需要添加配料
    boolean customerWantCondiments() {
        return true;
    }
}
