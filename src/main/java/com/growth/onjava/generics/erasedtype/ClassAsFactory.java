package com.growth.onjava.generics.erasedtype;

import java.util.function.Supplier;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/2 12:20 PM
 *
 * 创建类型实例，在Erased.java中创建new T()是不会成功的，部分原因是类型擦除，另一部分原因是编译器无法验证T中是否存在无参构造器。
 *
 * Java的解决方案是传入一工厂对象，并通过它来创建新实例。
 * Class对象就是一个方便的工厂对象，因此如果你使用了类型标签，便可以通过newInstance()来创建该类型的新对象。
 */
public class ClassAsFactory<T> implements Supplier<T> {
    Class<T> kind;

    ClassAsFactory(Class<T> kind){
        this.kind = kind;
    }
    @Override
    public T get() {
        try {
            return kind.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
