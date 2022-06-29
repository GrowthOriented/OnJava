package com.growth.onjava.generics.genericsmethod;

import java.lang.reflect.InvocationTargetException;
import java.util.function.Supplier;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/29 8:34 AM
 *
 * 示例的的类可以为任务具有午餐构造器的类生成一个Supplier。
 * 为了减少代码编写量，它还包含了一个用于生成BasicSupplier的泛型方法。
 */
public class BasicSupplier<T> implements Supplier<T> {

    private Class<T> type;

    public BasicSupplier(Class<T> type){
        this.type = type;
    }
    @Override
    public T get() {
        try {
            return type.getConstructor().newInstance();
        } catch (InstantiationException |
                IllegalAccessException |
                InvocationTargetException |
                NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    /**
     * 基于类型标记生成默认的Supplier
     * @param type
     * @param <T>
     * @return
     */
    public static <T> Supplier<T> create(Class<T> type){
        return new BasicSupplier<>(type);
    }
}
