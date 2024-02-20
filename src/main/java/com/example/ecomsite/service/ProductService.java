package com.example.ecomsite.service;

import com.example.ecomsite.Repository.ProductRepository;
import com.example.ecomsite.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
@Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    public List<Product> getAllProducts() {
//        return productRepository.findAll();
//    }

//    public Product getProductById(int productId) {
//        return productRepository.findById(productId).orElse(null);
//    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

//    public void deleteProduct(int productId) {
//        productRepository.deleteById(productId);
//    }

}
