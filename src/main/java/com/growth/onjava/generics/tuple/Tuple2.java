package com.growth.onjava.generics.tuple;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/28 7:55 AM
 *
 */
public class Tuple2<A, B> {
    public final A a;
    public final B b;

    public Tuple2(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public String rep() {
        return a + "," + b;
    }

    @Override
    public String toString() {
        return "(" + rep() + ")";
    }
}
