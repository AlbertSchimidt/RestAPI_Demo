package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.mockdata.ProductMockData;
import com.example.demo.service.interfaces.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Override
    public List<Product> findAll() {
        return ProductMockData.getProductsMockData();
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return ProductMockData.getProductsMockData().stream().filter(product -> product.getId().compareTo(id) == 0).findFirst();
    }
}
