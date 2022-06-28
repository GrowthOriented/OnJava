package com.growth.onjava.generics.tuple;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/28 8:13 AM
 * public字段上的final定义防止该字段在构造完成后被重新赋值，正如 ttsi.a="there"; //Compile error: final 所示。
 */

public class TupleTest {

    static Tuple2<String,Integer> f(){
        return new Tuple2<>("hi",47);
    }

    static Tuple3<Amphibian,String,Integer> g(){
        return new Tuple3<>(new Amphibian(),"hi",47);
    }
    static Tuple3<Amphibian,Vehicle,String> h(){
        return new Tuple3<>(new Amphibian(),new Vehicle(),"hi");

    }

    public static void main(String[] args) {
        Tuple2<String,Integer> ttsi = f();
        System.out.println(ttsi);
        // ttsi.a="there"; //Compile error: final
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());
    }

}
