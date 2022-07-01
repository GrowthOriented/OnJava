package com.growth.onjava.generics.erasedtype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 10:50 PM
 */
public class ListMaker<T> {
    List<T> create(){
        return new ArrayList<>();
    }
}
