package com.growth.onjava.generics.erasedtype;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 11:06 PM
 *
 * 由于类型擦除的缘故，我们失去了在泛型代码中执行某些操作的能力。
 * 任何需要在运行时知道确切类型的操作都无法运行。
 */
public class Erased<T> {
    private final int SIZE = 100;
    public void f(Object arg){
        //error:illegal generic type for instanceof
        //if(arg instanceof T){ }

        //error: unexpected type
        //T var = new T();

        //error: generic array creation
        //T[] array = new T[SIZE];

        //warning: unchecked cast
        //T[] array = (T[])new Object[SIZE];
    }
}
