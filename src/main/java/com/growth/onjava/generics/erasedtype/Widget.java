package com.growth.onjava.generics.erasedtype;

import java.util.function.Supplier;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/2 12:39 PM
 *
 * Widget包含了一个作为工厂的内部类。
 */
public class Widget {
    private int id;

    public Widget(int n) {
        this.id = n;
    }

    @Override
    public String toString() {
        return "Widget " + id;
    }

    public static class Factory implements Supplier<Widget>{
        private int i = 0;
        @Override
        public Widget get() {
            return new Widget(++i);
        }
    }

}
