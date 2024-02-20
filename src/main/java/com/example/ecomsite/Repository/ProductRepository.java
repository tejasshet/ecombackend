package com.example.ecomsite.Repository;
import com.example.ecomsite.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface ProductRepository extends JpaRepository<Product, Integer> {


   //additional query operations can be handled over here...


}
