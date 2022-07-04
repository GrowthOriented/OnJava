package com.growth.onjava.generics.boundary.inherit;

import com.growth.onjava.generics.boundary.Coord;
import com.growth.onjava.generics.boundary.HasColor;
import com.growth.onjava.generics.boundary.Weight;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:41 AM
 */
public class Solid2<T extends Coord & HasColor & Weight> extends WithColorCoord2<T> {
    public Solid2(T item) {
        super(item);
    }

    int weight() {
        return item.weight();
    }
}
