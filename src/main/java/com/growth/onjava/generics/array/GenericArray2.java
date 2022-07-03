package com.growth.onjava.generics.array;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/3 11:06 AM
 * 由于类型擦除的缘故，数组的运行时类型只能是Object[]。如果我们立即将其转型为T[]，那么在编译时，数组的实际类型就会丢失，
 * 编译器可能会错过对某些潜在的错误的检查。
 * 因此，更好的办法是在集合内使用Object[]，并在使用某个元素的是还早呢根据转型为T的操作。
 *
 * 现在内部表达所用的是Object[]，而不是T[]，
 */
public class GenericArray2<T> {
    private Object[] array;
    public GenericArray2(int sz){
        array = new Object[sz];
    }
    public void put(int index, T item){
        array[index] = item;
    }

    public T get(int index){
        return (T)array[index];
    }

    public T[] rep(){
        return (T[])array;
    }

    public static void main(String[] args) {
        GenericArray2<Integer> gai = new GenericArray2<>(10);
        for(int i = 0; i < 10; i ++){
            gai.put(i,i);
        }
        for(int i = 0; i < 10; i ++){
            System.out.print(gai.get(i)+" ");
        }
        System.out.println();
        try {
            Integer[] ia = gai.rep();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /**
         * 输出：
         * 0 1 2 3 4 5 6 7 8 9
         * [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
         */
    }
}
