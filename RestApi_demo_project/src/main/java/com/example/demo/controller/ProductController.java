package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    IProductService iProductService;

    @GetMapping("/products")
    public List<Product> findAll() {
        return iProductService.findAll();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") Integer id) {
        return ResponseEntity.of(iProductService.findById(id));
    }

}
