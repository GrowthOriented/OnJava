package com.growth.onjava.generics.complexmodel;

import com.growth.onjava.generics.Suppliers;

import java.util.ArrayList;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 3:08 PM
 */
public class Shelf extends ArrayList<Product> {
    Shelf(int nProducts){
        Suppliers.fill(this,Product.generator,nProducts);
    }
}
