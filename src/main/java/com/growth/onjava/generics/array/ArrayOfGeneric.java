package com.growth.onjava.generics.array;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/3 8:55 AM
 * 问题在于数组都时刻掌握着它们的实际类型信息，而该类型是在创建树脂道时刻确定的。
 * 因此尽管gia被转型为Generic<Integer>[]，该信息也只会存在于编译时。在运行时，它仍然还是Object数组，而这会导致问题。
 * 唯一可以成功创建泛型类型数组的方法就是创建一个类型为为被擦除类型的新数组，然后对其进行类型转换。
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        try {
            gia = (Generic<Integer>[]) new Object[SIZE];
        } catch (Exception e) {
            //ClassCastException
            //[Ljava.lang.Object; cannot be cast to [Lcom.growth.onjava.generics.array.Generic;
            System.out.println(e.getMessage());
        }
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<>();
        //gia[1] = new Object();
        //gia[2] = new Generic<Double>();

        /**
         * 输出：
         * [Ljava.lang.Object; cannot be cast to [Lcom.growth.onjava.generics.array.Generic;
         * Generic[]
         */
    }
}
