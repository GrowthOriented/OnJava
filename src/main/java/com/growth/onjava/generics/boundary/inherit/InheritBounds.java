package com.growth.onjava.generics.boundary.inherit;

import com.growth.onjava.generics.boundary.Bounded;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:45 AM
 */
public class InheritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> solid2 = new Solid2<>(new Bounded());
        solid2.color();
        solid2.getY();
        solid2.weight();
    }
}
