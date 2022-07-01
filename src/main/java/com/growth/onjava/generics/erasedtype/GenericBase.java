package com.growth.onjava.generics.erasedtype;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 10:24 PM
 */
public class GenericBase<T> {
    private T element;
    public void set(T arg) {
        element = arg;
    }
    public T get(){
        return element;
    }
}
