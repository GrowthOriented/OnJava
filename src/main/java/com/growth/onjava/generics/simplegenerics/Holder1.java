package com.growth.onjava.generics.simplegenerics;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/27 11:02 PM
 * 下面这个类持有一个简单的对象，并可以指定对象的具体类型。
 * 这样的复用性并不高，因为它无法用来持有任何其他的东西。我们不会想去为每个遇到的类型都写一份相同的代码。
 */
class Automobile {

}

public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}
