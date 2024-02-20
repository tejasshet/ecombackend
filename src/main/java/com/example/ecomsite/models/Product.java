package com.example.ecomsite.models;

import jakarta.persistence.*;
@Entity
@Table(name = "Product")
public class Product {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "product_id")
      private  Integer productId;
      @Column(name = "product_name", nullable = false)
      private  String productName;
      @Column(name = "product_Description", nullable = false)
      private  String productDescription;
      @Column(name = "unit_price", nullable = false)
      private double unitPrice;

      @Column(name ="rating", nullable = false)
      private double rating;

      @Column(name = "no-of_Ratings", nullable = false)
      private Integer noOfRatings;

      public Integer getProductId() {
            return productId;
      }

      public void setProductId(Integer productId) {
            this.productId = productId;
      }

      public String getProductName() {
            return productName;
      }

      public void setProductName(String productName) {
            this.productName = productName;
      }

      public String getProductDescription() {
            return productDescription;
      }

      public void setProductDescription(String productDescription) {
            this.productDescription = productDescription;
      }

      public double getUnitPrice() {
            return unitPrice;
      }

      public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
      }

      public double getRating() {
            return rating;
      }

      public void setRating(double rating) {
            this.rating = rating;
      }

      public Integer getNoOfRatings() {
            return noOfRatings;
      }

      public void setNoOfRatings(Integer noOfRatings) {
            this.noOfRatings = noOfRatings;
      }

      //calculate the rating for the noOfRatings......
//      public void addRating(BigDecimal newRating){
//            BigDecimal totalRating = rating.multiply(BigDecimal.valueOf(noOfRatings));
//            rating = rating.add(totalRating).divide(BigDecimal.valueOf(noOfRatings));
//            noOfRatings++;  //as the newAverageRatings gets increased so noOfRatings gets increased....
//      }
}
