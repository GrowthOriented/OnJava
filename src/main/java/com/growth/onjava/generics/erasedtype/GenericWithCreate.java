package com.growth.onjava.generics.erasedtype;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/3 8:29 AM
 *
 * 另外一种方法时使用设计模式:模板方法。
 * 在下面示例中，create()就是那个模板方法，其在子类中被重写，用来生成该类型的对象。
 */
public abstract class GenericWithCreate<T> {
    final T element;
    GenericWithCreate(){
        element = create();
    }
    abstract T create();
}
