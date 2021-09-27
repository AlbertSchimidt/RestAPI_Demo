package com.example.demo.model.mockdata;

import com.example.demo.model.Product;
import com.example.demo.model.builder.ProductBuilder;
import com.example.demo.utils.RandomValue;

import java.util.ArrayList;
import java.util.List;

public class ProductMockData {

    public static List<Product> getProductsMockData() {
        List<Product> productList = new ArrayList<>();

        productList.add(ProductBuilder.aProduct().withId(productList.size() + 1).withDescricao("Product ".concat(String.valueOf(productList.size() + 1))).withPrecoVenda(RandomValue.getRandomDouble(null, null)).build());
        productList.add(ProductBuilder.aProduct().withId(productList.size() + 1).withDescricao("Product ".concat(String.valueOf(productList.size() + 1))).withPrecoVenda(RandomValue.getRandomDouble(null, null)).build());
        productList.add(ProductBuilder.aProduct().withId(productList.size() + 1).withDescricao("Product ".concat(String.valueOf(productList.size() + 1))).withPrecoVenda(RandomValue.getRandomDouble(null, null)).build());
        productList.add(ProductBuilder.aProduct().withId(productList.size() + 1).withDescricao("Product ".concat(String.valueOf(productList.size() + 1))).withPrecoVenda(RandomValue.getRandomDouble(null, null)).build());
        productList.add(ProductBuilder.aProduct().withId(productList.size() + 1).withDescricao("Product ".concat(String.valueOf(productList.size() + 1))).withPrecoVenda(RandomValue.getRandomDouble(null, null)).build());
        productList.add(ProductBuilder.aProduct().withId(productList.size() + 1).withDescricao("Product ".concat(String.valueOf(productList.size() + 1))).withPrecoVenda(RandomValue.getRandomDouble(null, null)).build());

        return productList;
    }

}
