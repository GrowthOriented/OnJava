package com.growth.onjava.generics.genericsmethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/29 8:15 AM
 *
 * 这里的makeList()方法实现了和标准库的java.util.Arrarys.asList()方法一样的功能。
 *
 * @SafeVarargs注解表示我们承诺不会对变量参数列表做任何修改，实际上也是这样，因为我们只会对它进行读取。
 */
public class GenericVarargs {

    @SafeVarargs
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ADJPEOEONDKLDDLDLDLWIIHNVN".split(""));
        System.out.println(ls);
    }
}
