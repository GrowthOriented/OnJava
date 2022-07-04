package com.growth.onjava.generics.boundary.inherit;

import com.growth.onjava.generics.boundary.HasColor;

import java.awt.*;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:38 AM
 */
public class WithColor2<T extends HasColor> extends HoldItem<T> {

    public WithColor2(T item) {
        super(item);
    }

    Color color() {
        return item.getColor();
    }
}
