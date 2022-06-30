package com.growth.onjava.generics.genericsmethod;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/30 8:36 AM
 *
 * 在举个泛型方法的例子，想想由Set所表示的那些数学关系。
 * 这些数学关系可以很方便地定义成可用于所有不同类型的泛型方法。
 */
public class Sets {
    /**
     * 合并
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }

    /**
     * 交集
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    /**
     * 从superset中移除subset所包含的全部元素
     * @param superset
     * @param subset
     * @param <T>
     * @return
     */
    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    /**
     * 反过来-所有不在交集中的元素
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
