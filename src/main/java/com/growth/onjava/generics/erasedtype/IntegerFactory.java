package com.growth.onjava.generics.erasedtype;

import java.util.function.Supplier;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/2 12:37 PM
 *
 * IntegerFactory自身是个实现了Suplier<Integer>接口的工厂。
 */
public class IntegerFactory implements Supplier<Integer> {

    private int i = 0;
    @Override
    public Integer get() {
        return ++i;
    }
}
