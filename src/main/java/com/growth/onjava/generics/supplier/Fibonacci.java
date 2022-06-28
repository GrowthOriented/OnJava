package com.growth.onjava.generics.supplier;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 斐波那契数列指的是这样一个数列：1，1，2，3，5，8，13，21，34，55，89...
 * 这个数列从第3项开始，每一项都等于前两项之和。
 *
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/29 7:34 AM
 *
 * Supplier<T>的第二种实现，这次是要生成斐波那契数列
 *
 * 虽然我们在该类的内外部使用的都是int，但是类型参数是Integer。
 * 这就引出了Java泛型的限制之一：无法将基本类型作为类型参数。
 * 不过，Java5的自动装箱和自动拆箱机制实现了从基本类型到包装类型的双向转换。
 */
public class Fibonacci implements Supplier<Integer> {

    private int count = 0;

    @Override
    public Integer get() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Stream.generate(new Fibonacci())
                .limit(18)
                .map(n -> n + "")
                .forEach(System.out::println);
    }
}
