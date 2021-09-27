package com.example.demo.model.builder;

import com.example.demo.model.Product;

public final class ProductBuilder {

    private Product product;

    private ProductBuilder() {
        product = new Product();
    }

    public static ProductBuilder aProduct() {
        return new ProductBuilder();
    }

    public ProductBuilder withId(Integer id) {
        product.setId(id);
        return this;
    }

    public ProductBuilder withDescricao(String descricao) {
        product.setDescricao(descricao);
        return this;
    }

    public ProductBuilder withPrecoVenda(Double precoVenda) {
        product.setPrecoVenda(precoVenda);
        return this;
    }

    public ProductBuilder but() {
        return aProduct()
                .withId(product.getId())
                .withDescricao(product.getDescricao())
                .withPrecoVenda(product.getPrecoVenda());
    }

    public Product build() {
        return product;
    }
}
