package com.growth.onjava.generics.complexmodel;

import java.util.ArrayList;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 3:09 PM
 */
public class Aisle extends ArrayList<Shelf> {
    Aisle(int nShelves, int nProducts){
        for (int i = 0; i < nShelves; i++){
            add(new Shelf(nProducts));
        }
    }
}
