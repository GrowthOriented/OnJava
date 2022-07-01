package com.growth.onjava.generics.complexmodel;

import java.util.Random;
import java.util.function.Supplier;

/**
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/7/1 2:58 PM
 *
 * 第二个示例，尽管每个类都是构建块，但是总的模块还是很多的。此处的模型为一个带有通道，货架以及货品的商店
 */
public class Product {

    private final int id;

    private String description;
    private double price;

    Product(int idNumber, String desc, double price) {
        id = idNumber;
        description = desc;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ", price: $" + price;
    }

    public void priceChange(double change){
        price +=change;
    }

    public static Supplier<Product> generator = new Supplier<Product>() {
        private Random rand = new Random(47);
        @Override
        public Product get() {
            return new Product(rand.nextInt(1000), "Test"
                    , Math.round(rand.nextDouble()*1000.0)+0.99);
        }
    };
}
