package com.growth.onjava.generics.array;

import java.lang.reflect.Array;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 7:38 AM
 * 对应新代码，应该传入一个类型标记。
 * 这里将类型标记Class<T>传入了构造器，以用于擦除后的类型恢复，这样就能够创建实际所需类型的数组了。
 *
 * 在Java文献中往往会推荐使用类型标记的技巧。然而我发现人们在这项技巧上的喜好并不一直，有人强烈推荐工厂的方式。
 */
public class GenericArrayWithTypeToken<T> {
    private T[] array;

    public GenericArrayWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
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
        GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<>(Integer.class, 10);

        //现在可以正常运行了
        Integer[] ia = gai.rep();
    }
}
