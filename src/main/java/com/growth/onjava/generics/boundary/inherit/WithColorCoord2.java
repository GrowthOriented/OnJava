package com.growth.onjava.generics.boundary.inherit;

import com.growth.onjava.generics.boundary.Coord;
import com.growth.onjava.generics.boundary.HasColor;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:40 AM
 */
public class WithColorCoord2<T extends Coord & HasColor> extends WithColor2<T> {
    public WithColorCoord2(T item) {
        super(item);
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
