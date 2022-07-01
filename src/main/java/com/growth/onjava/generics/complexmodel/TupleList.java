package com.growth.onjava.generics.complexmodel;

import com.growth.onjava.generics.genericsmethod.TupleTest2;
import com.growth.onjava.generics.tuple.Amphibian;
import com.growth.onjava.generics.tuple.Tuple3;

import java.util.ArrayList;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 2:18 PM
 * 泛型有个重要的好处，即具有简单且安全地创建复杂模型的能力。举例来说，我们可以很容易地创建一个元组List。
 */
public class TupleList<A,B,C> extends ArrayList<Tuple3<A,B,C>> {
    public static void main(String[] args) {
        TupleList<Amphibian, String, Integer> tl = new TupleList<>();
        tl.add(TupleTest2.g());
        tl.forEach(System.out::println);
    }
}
