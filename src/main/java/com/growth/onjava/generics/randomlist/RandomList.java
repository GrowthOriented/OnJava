package com.growth.onjava.generics.randomlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/28 11:06 PM
 * 再举一个holder的例子，假设你想实现一个list类型，每次调用select()都会从其中的元素里随机选取一个。
 * 如果想构建一个可用于所有类型的工具，便可以使用泛型。
 *
 * 由于RandomList(随机列表)继承自ArrayList，因此它拥有ArrayList中全部的内建行为。我们仅仅添加了select方法。
 */
public class RandomList<T> extends ArrayList<T> {
    private Random rand = new Random(47);

    public T select() {
        return get(rand.nextInt(size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        Arrays.stream("good good study day day up".split(" ")).forEach(rs::add);
        IntStream.range(0, 11).forEach(i -> System.out.println(rs.select() + ""));
    }
}
