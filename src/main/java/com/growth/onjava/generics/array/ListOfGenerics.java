package com.growth.onjava.generics.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/3 8:45 AM
 *
 * 如你在Erased.java中所见，你是无法创建泛型数组的。通用的解决办法是不管在何处，你都用ArrayList来创建泛型数组。
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<>();

    public void add(T item) {
        array.add(item);
    }

    public T get(int index) {
        return array.get(index);
    }

}
