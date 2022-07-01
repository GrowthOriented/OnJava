package com.growth.onjava.generics.erasedtype;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 10:41 PM
 *
 * 尽管kind看起来被存储为Class<T>,但是类型擦除意味着它实际上只是被存为一个不带参数的Class。
 * 因此你在创建数组的时候，Array.newInstance()并不实际掌握kind含有的类型信息。
 * 它无法生成具体的结果，因此必须进行类型转换，这会产生令人不悦的警告。
 *
 * 注意对Array.newInstance()的使用，这是在泛型中创建数组的推荐方式。
 */
public class ArrayMarker<T> {
    private Class<T> kind;
    public ArrayMarker(Class<T> kind){
        this.kind = kind;
    }
    T[] create(int size){
        return (T[])Array.newInstance(kind,size);
    }

    public static void main(String[] args) {
        ArrayMarker<String> stringMarker = new ArrayMarker<>(String.class);
        String[] stringArray = stringMarker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }
}
