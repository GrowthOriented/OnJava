package com.growth.onjava.generics.erasedtype;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/3 8:30 AM
 *
 * GenericWithCreate中包含了element字段，并强制通过无参构造含税来进行自身的初始化，
 * 然后调用abstract create()方法。这种方法可以将创建逻辑定义在子类中，同事T的类型也得到确定。
 */
public class XCreator extends GenericWithCreate<X> {
    @Override
    X create() {
        return new X();
    }
    void f(){
        System.out.println(element.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        XCreator xc = new XCreator();
        xc.f();
    }

    /**
     * 输出：
     * X
     */
}
