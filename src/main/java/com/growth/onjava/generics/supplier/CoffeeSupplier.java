package com.growth.onjava.generics.supplier;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 泛型同样使用于接口，举例来说，生成器(generator)是一种用于创建对象的类。
 * 一般来说生成器只会定义一个方法，即用于生成新对象的方法。
 * java.util.function库将生成器定义为Supplier，其中的生成方法则称为get()。get()的返回类型被参数化为T。
 *
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/29 6:49 AM
 *
 * 实现一个生成不同的随机Coffee对象类型的Supplier<Coffee>。
 *
 * 参数化的Supplier接口会确保get()方法返回的是参数类型。
 * CoffeeSupplier同样实现了Iterable节课，因此它可以在for-in语句中使用。不过它必须知道何时该停止，而这是由第二个构造器指定的。
 */
public class CoffeeSupplier implements Supplier<Coffee>, Iterable<Coffee> {

    private Class<?>[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};

    private static Random rand = new Random(47);

    public CoffeeSupplier() {

    }

    private int size = 0;

    public CoffeeSupplier(int sz) {
        size = sz;
    }

    @Override
    public Coffee get() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].getConstructor().newInstance();
        } catch (InstantiationException |
                IllegalAccessException |
                InvocationTargetException |
                NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeSupplier.this.get();
        }

        @Override
        public void remove() {
            //未实现
            throw new UnsupportedOperationException();
        }
    }


    public static void main(String[] args) {
        // static <T> Stream<T> generate​(Supplier<? extends T> s)
        // 主要用于生成一个无限连续的无序流，流中的元素由用户定义的supplier函数生成。
        Stream.generate(new CoffeeSupplier()).limit(5).forEach(System.out::println);

        for (Coffee c : new CoffeeSupplier(5)) {
            System.out.println(c);
        }
    }
}
