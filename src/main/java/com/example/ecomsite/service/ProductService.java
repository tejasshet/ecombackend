package com.example.ecomsite.service;

import com.example.ecomsite.models.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int productId);
    Product saveProduct(Product product);
    void deleteProduct(int productId);
}