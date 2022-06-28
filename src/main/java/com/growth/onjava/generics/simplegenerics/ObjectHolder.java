package com.growth.onjava.generics.simplegenerics;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/27 11:07 PM
 * 在Java5之前，我们会简单地通过持有一个Object对象来实现。
 * 这样ObjectHolder就可以持有任何东西了，ObjectHolder持有了3个不同类型的对象。
 */
public class ObjectHolder {
    private Object a;

    public ObjectHolder(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public static void main(String[] args) {
        ObjectHolder h2 = new ObjectHolder(new Automobile());
        Automobile a = (Automobile) h2.get();
        h2.set("Not an Automobile");
        String s = (String) h2.get();
        h2.set(1); // 自动装箱为Integer
        Integer x = (Integer) h2.get();
    }
}
