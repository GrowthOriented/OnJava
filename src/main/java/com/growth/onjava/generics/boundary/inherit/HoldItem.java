package com.growth.onjava.generics.boundary.inherit;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:37 AM
 */
public class HoldItem<T> {
    T item;

    HoldItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}
