package com.growth.onjava.generics.boundary;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:04 AM
 * <p>
 * 多重边界
 */
//这个样会失败，类(Coord)必须在最前后，然后才是接口(HasColor)
//public class WithColorCoord<T extends HasColor & Coord> {}
public class WithColorCoord<T extends Coord & HasColor> {

    T item;

    WithColorCoord(T item) {
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
}
