package com.growth.onjava.generics.boundary;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/4 8:01 AM
 */
public class WithColor<T extends HasColor> {
    T item;
    WithColor(T item){
        this.item = item;
    }
    T getItem(){
        return item;
    }
    // 可以调用边界中的方法：
    java.awt.Color color(){
        return item.getColor();
    }
}
