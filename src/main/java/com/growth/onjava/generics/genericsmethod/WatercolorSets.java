package com.growth.onjava.generics.genericsmethod;

import java.util.EnumSet;
import java.util.Set;

import static com.growth.onjava.generics.genericsmethod.Watercolors.*;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 10:55 AM
 */
public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BLACK, PINK);
        Set<Watercolors> set2 = EnumSet.range(YELLOW, GRAY);
        System.out.println("set1:" + set1);
        System.out.println("set2:" + set2);
        System.out.println("union(set1, set2):" + Sets.union(set1, set2));
        Set<Watercolors> subset = Sets.intersection(set1, set2);
        System.out.println("intersection(set1, set2):" + subset);
        System.out.println("difference(set1, subset):" + Sets.difference(set1, subset));
        System.out.println("complement(set1, set2):" + Sets.complement(set1, set2));
    }
}
