package com.growth.onjava.generics.genericsmethod;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/29 8:01 AM
 * 泛型方法改变这方法的行为，而不受类的影响。
 * 可以使用这个准则：尽量使用泛型方法，相比于泛型化整个类，泛型化单个方法通常来说会更清晰。
 *
 *  如果某个方法时静态的，它便没有访问类的泛型类型参数的权限，因此如果要用到泛型能力，它必须是泛型方法。
 *
 *  要定义一个方向方法，需要将泛型参数列表放在返回值之前。
 *
 *  使用泛型类时，在实例化类的时候必须指定类型参数。
 *  而使用泛型方法的时候，通常不需要指定参数类型，因为编译器会为你检查出来。这称为类型参数推断。
 *  因此调用f()方法看起来就和调用普通方法一样。
 *
 *  在用基本类型调用f()方法时，自动装箱机制便会生效，将基本类型自动包装为相应的对象。
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f("c");
        gm.f(gm);
    }
}
