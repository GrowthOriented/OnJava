package com.growth.onjava.generics.simplegenerics;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/27 11:15 PM
 *
 * 相较于Object，我们更倾向指定一个类型占用符，并在晚些时候再决定（具体的类型）。
 * 要实现这个目的，你需要再类名后面的尖括号内防止一个参数类型，然后再使用该类的时候再将其替换为实际的类型。
 * 如下例代码所示，其中T就是类型参数。
 *
 * 正如你在main()中所见，在创建GenericHolder的时候，需要用尖括号语法来制定它要保存的类型。
 * 你只能将该类型的对象（或者它的子类，因为继承机制任然适用于泛型）放入该holder。
 * 如果你调用get()来提取值，取出来的值自动就是正确的类型。
 *
 * 这便是Java泛型的核心理念：只需要告诉泛型所需要的类型，剩下的全部细节就可以都交给它了。
 */
public class GenericHolder <T>{
    private T a;
    public GenericHolder(){

    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        GenericHolder<Automobile> h3= new GenericHolder<>();
        h3.set(new Automobile());
        Automobile a = h3.get();

        //h3.set("Not an Automobile"); // Error
        //h3.set(1); // Error
    }
}
