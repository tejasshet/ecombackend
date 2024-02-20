package com.example.ecomsite.controller;
import com.example.ecomsite.models.Product;
import com.example.ecomsite.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping
  public List<Product> getAllProducts() {
    return productService.getAllProducts();
  }

  @GetMapping("/{productId}")  // corrected annotation
  public ResponseEntity<Product> getProductById(@PathVariable int productId) {
    Product product = productService.getProductById(productId);
    return ResponseEntity.ok(product);
  }

  @PostMapping
  public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
    Product savedProduct = productService.saveProduct(product);
    return ResponseEntity.ok(savedProduct);
  }
  @DeleteMapping("/{productId}")  // corrected annotation and added @PathVariable
  public ResponseEntity<Void> deleteProduct(@PathVariable int productId) {
    productService.deleteProduct(productId);
    return ResponseEntity.noContent().build();
  }
}
