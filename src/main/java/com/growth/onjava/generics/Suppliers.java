package com.growth.onjava.generics;

import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 2:43 PM
 */
public class Suppliers {
    /**
     * 填充已有集合
     */
    public static <T,C extends Collection<T>> C fill(C coll, Supplier<T> gen, int n){
        Stream.generate(gen).limit(n).forEach(coll::add);
        return coll;
    }
}
