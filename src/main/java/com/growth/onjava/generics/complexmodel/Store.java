package com.growth.onjava.generics.complexmodel;

import java.util.ArrayList;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 3:11 PM
 * 从Store.toString()方法可以看出效果：集合具有很多层，但仍然是类型安全且便于管理的。
 *
 * Shelf通过工具Suppliers.fill()接收一个Collection类（第一个参数），
 * 并通过Supplier（第二个参数）将n（第三个参数）个元素填充进该Collection。
 */
public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
    private Office office = new Office();
    public Store(int nAisles, int nShelves, int nProducts){
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisle a: this){
            for (Shelf s: a){
                for(Product p : s){
                    result.append(p);
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(5,4,3));
    }
}
