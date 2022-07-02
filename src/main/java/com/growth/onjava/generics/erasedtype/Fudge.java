package com.growth.onjava.generics.erasedtype;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/2 12:50 PM
 *
 * Fudge并不执行任何类似工厂的操作，但是传入Fudge::new仍然会产生工厂的行为，
 * 因为编译器将对函数方法::new的调用，转变成了对get()的调用。
 */
public class Fudge {
    private static int count = 1;
    private int n = count++;

    @Override
    public String toString() {
        return "Fudge " + n;
    }

    /**
     * 输出：
     * [1, 2, 3, 4, 5]
     * [Widget 1, Widget 2, Widget 3, Widget 4, Widget 5]
     * [Fudge 1, Fudge 2, Fudge 3, Fudge 4, Fudge 5]
     */
}
