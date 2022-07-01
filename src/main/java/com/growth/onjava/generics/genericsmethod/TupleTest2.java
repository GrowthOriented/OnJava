package com.growth.onjava.generics.genericsmethod;

import com.growth.onjava.generics.tuple.Amphibian;
import com.growth.onjava.generics.tuple.Tuple2;
import com.growth.onjava.generics.tuple.Tuple3;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/30 8:22 AM
 */
public class TupleTest2 {
    static Tuple2<String,Integer> f(){
        return Tuple.tuple("hi",47);
    }

    public static Tuple3<Amphibian,String,Integer> g(){
        return Tuple.tuple(new Amphibian(),"hi",47);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(g());
    }
}
