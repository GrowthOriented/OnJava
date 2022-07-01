package com.growth.onjava.generics.erasedtype;

import java.util.ArrayList;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 5:17 PM
 *
 * 当你深入地了解泛型时，会发现有些问题起初看起来并不合理。
 * 举例来说，虽然生命ArrayList.class是合法的，但是声明ArrayList<Integer>.class却不行。
 * 看看下面的示例ArrayList<String>和ArrayList<Integer>应该是不同的类型，
 * 而不同类型具有不同的行为。如果你试图将Integer放入ArrayList<String>（这会失败），便应该得到和将
 * Integer放入ArrayList<Integer>（这会成功）的结果所不同的行为。
 * 然而下面的程序会认为这两则是相同的类型。
 */
public class ErasedTypeEquvialence {
    public static void main(String[] args) {

        Class c1 = new ArrayList<String>().getClass();

        Class c2 = new ArrayList<Integer>().getClass();

        System.out.println(c1 == c2); //输出true
    }
}
