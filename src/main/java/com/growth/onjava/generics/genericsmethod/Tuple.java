package com.growth.onjava.generics.genericsmethod;

import com.growth.onjava.generics.tuple.Tuple2;
import com.growth.onjava.generics.tuple.Tuple3;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/30 8:18 AM
 *
 * 有了类型参数推断和静态导入，我们便可以将元组重写为一个更加通用的库。
 * 下面我们用一个重载的静态方法来创建元组
 */
public class Tuple {
    public static <A, B> Tuple2<A, B> tuple(A a, B b) {
        return new Tuple2<>(a, b);
    }

    public static <A, B, C> Tuple3<A, B, C> tuple(A a, B b, C c) {
        return new Tuple3<>(a, b, c);
    }
}
