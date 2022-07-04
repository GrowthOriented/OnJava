package com.growth.onjava.generics.boundary;

import java.awt.*;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:14 AM
 */
public class Bounded extends Coord implements HasColor, Weight {
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}
