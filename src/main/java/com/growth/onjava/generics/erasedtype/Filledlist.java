package com.growth.onjava.generics.erasedtype;

import com.growth.onjava.generics.Suppliers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 10:54 PM
 */
public class Filledlist<T> extends ArrayList<T> {
    Filledlist(Supplier<T> gen, int size) {
        Suppliers.fill(this, gen, size);
    }

    public Filledlist(T t, int size) {
        for (int i = 0; i < size; i++) {
            this.add(t);
        }
    }

    public static void main(String[] args) {
        List<String> list = new Filledlist<>("Hello", 4);
        System.out.println(list);
        List<Integer> ilist = new Filledlist<>(() -> 47, 4);
        System.out.println(ilist);
    }
}
