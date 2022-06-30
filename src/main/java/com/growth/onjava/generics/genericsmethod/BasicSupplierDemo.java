package com.growth.onjava.generics.genericsmethod;

import java.util.stream.Stream;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/30 8:00 AM
 *
 * 泛型方法减少生成Supplier对象所必须的代码编写量
 */
public class BasicSupplierDemo {
    public static void main(String[] args) {
        Stream.generate(BasicSupplier.create(CountedObject.class))
                .limit(5)
                .forEach(System.out::println);
    }
}
