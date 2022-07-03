package com.growth.onjava.generics.array;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/3 10:47 AM
 *
 * 一个简单的泛型数组包装类。
 * 如之前所述我们无法声明T[] array = new T[sz]，因此我们可以创建一个对象数组，并对它进行转型。
 *
 * rep()方法返回一个T[]，对应到main()中gai.rep()则应该返回Integer[]，
 * 但是如果你调用了rep()兵试图将结果作为Integer[]的引用来获取，便会抛出ClassCastException异常，
 * 这仍然是因为运行时类型实际是Object[]。
 *
 */
public class GenericArray<T> {
    private T[] array;

    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
        try {
            Integer[] ia = gai.rep();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Integer gi = gai.get(1);
        System.out.println(gi);
        //这没问题：
        Object[] oa = gai.rep();
        /**
         * 输出：
         * [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
         */


    }
}
