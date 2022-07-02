package com.growth.onjava.generics.erasedtype;

import com.growth.onjava.generics.Suppliers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/2 12:50 PM
 */
public class Foo2<T> {
    private List<T> x= new ArrayList<>();

    Foo2(Supplier<T> factory){
        Suppliers.fill(x,factory,5);

    }

    @Override
    public String toString() {
        return x.toString();
    }

}