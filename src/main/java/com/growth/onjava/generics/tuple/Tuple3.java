package com.growth.onjava.generics.tuple;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/28 8:07 AM
 */
public class Tuple3<A, B, C> extends Tuple2<A, B> {
    public final C c;

    public Tuple3(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String rep() {
        return super.rep() + "," + c;
    }
}
