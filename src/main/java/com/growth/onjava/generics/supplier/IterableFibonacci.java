package com.growth.onjava.generics.supplier;

import java.util.Iterator;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/29 7:47 AM
 *
 * 我们可以更近一步，实现一个Iterable(可迭代)的斐波那契数列。
 * 一种选择是重新实现这个类，并增加Iterable接口，但是你不一定总能拥有原始代码的控制器，所以除非必要，否则不要重写。
 * 相反，我们可以创建一个适配器（Adapter是一种设计模式）来生成所需的接口。
 * 适配器有多种实现方式，比如，可以通过继承生成适配器类。
 *
 * 为了可以在for-in语句中使用IterableFibonacci，你需要为构造器设置一个边界，这样hasNext()才能知道何时该返回false。
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

    private int n;

    public IterableFibonacci(int count) {
        n = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.get();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18)) {
            System.out.println(i + "");
        }
    }
}
