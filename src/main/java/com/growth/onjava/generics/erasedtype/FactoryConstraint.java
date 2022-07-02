package com.growth.onjava.generics.erasedtype;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/2 12:51 PM
 */
public class FactoryConstraint{
    public static void main(String[] args) {
        System.out.println(new Foo2<>(new IntegerFactory()));
        System.out.println(new Foo2<>(new Widget.Factory()));
        System.out.println(new Foo2<>(Fudge::new));
    }
}
