package com.growth.onjava.generics.boundary;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:11 AM
 * 和使用继承一样，只能继承一个具体类，而可以实现多个接口
 */
public class Solid<T extends Coord & HasColor & Weight> {
    T item;

    Solid(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }

    java.awt.Color color() {
        return item.getColor();
    }

    int getX() {
        return item.x;
    }

    int getY() {
        return item.y;
    }

    int getZ() {
        return item.z;
    }

    int weight() {
        return item.weight();
    }
}
