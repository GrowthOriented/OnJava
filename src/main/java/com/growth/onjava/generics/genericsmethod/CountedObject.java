package com.growth.onjava.generics.genericsmethod;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/30 7:55 AM
 *
 * 下面是一个简单的具有无参构造器的类
 *
 * CountedObject类一直记录着已创建出的自身实例的数量，并通过toString()方法报告出来。
 * BasicSupplier可以很轻松地为CountedObject创建Supplier
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id(){return id;}

    @Override
    public String toString() {
        return "CountedObject"+id;
    }
}
