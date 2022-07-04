package com.growth.onjava.generics.boundary;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:15 AM
 *
 * 边界让你在使用泛型的时候，可以在参数类型上增加限制。
 * 虽然你可以强制执行应用泛型的类型规则，但是更重要的潜在效果是，你可以调用边界类型上的方法。
 *
 * 由于类型擦除了类型信息，对应无边界的泛型参数，比仅能调用Object中可用的方法。
 *
 * 不过如果能够将参数类型限制在某个类型子集中，你就可以调用该子集上可用的方法了，
 * 为了应用这种限制，Java泛型复用了extends关键字。
 */
public class BasicBounds {
    public static void main(String[] args) {
        Solid<Bounded> solid = new Solid<>(new Bounded());
        solid.color();
        solid.getY();
        solid.weight();
    }
}
