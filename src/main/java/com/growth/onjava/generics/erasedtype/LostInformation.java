package com.growth.onjava.generics.erasedtype;

import java.util.*;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 5:33 PM
 *
 * 根据JKD文档描述，Class.getTypeParameters()会 "返回一个由TypeVariable对象组成的数组，
 * 代表由泛型声明所声明的类型变量..."。这似乎在暗示可以发现参数的类型信息。
 * 然而，如程序输出所示，你只能发现作为参数占位符的标识符-这有点儿令人失望。
 *
 * 所以残酷的事实是：泛型代码内部并不存在有关泛型参数类型的可用信息。
 *
 * 因此，你可以知道类型参数的标识符信息，但你就是无法知道实际用于创建具体实例的类型参数。
 * Java泛型是通过类型擦除实现的。这意味着在使用泛型时，任何具体的类型信息都将被擦除。
 * 因此List<String>和List<Integer>在运行时实际是相同的类型。两者都被擦除为它们的原始类型（raw type）：List。
 *
 * 类型擦除的初衷是，希望让泛化的调用方程序可以依赖非泛化的库正常使用。这通常称为迁移兼容性。
 */
public class LostInformation {
    public static void main(String[] args) {
        List<Frob> list = new ArrayList<>();
        Map<Frob, Fnorkle> map = new HashMap<>();
        Quark<Fnorkle> quark = new Quark<>();
        Particle<Long ,Double> p = new Particle<>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));

    }
}
