package com.example.product.productService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Product {

   @Id
    private Integer productID;
    private String productName;
    private Long productPrice;
    private String productDescription;

}
