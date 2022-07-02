package com.growth.onjava.generics.erasedtype;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/2 12:26 PM
 *
 * 这样会编译成功，但如果使用ClassAsFactory(Integer)则会失败，因为Integer中并没有无参构造器。
 * 由于该错误并不是在编译器捕获的，因此这种方法遭到Java设计者们的反对。
 * 他们建议使用显示工厂(Supplier),并对类型进行限制，使其仅能接收实现了该工厂的类。
 */
public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println(fe.get());

        ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        System.out.println(fi.get());

        /**
         * 输出：
         * Employee
         * java.lang.NoSuchMethodException:java.lang.Integer.<init>()
         */
    }
}
