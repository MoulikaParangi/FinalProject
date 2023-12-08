package com.example.product.productService.service;

import com.example.product.productService.repository.ProductRepository;
import com.example.product.productService.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product)
    {
        productRepository.save(product);
        log.info("prodcut added successfully");
        return  product;
    }
    public List<Product> getAllProducts()
    {
        log.info("All products returned");
         return productRepository.findAll();

    }

    public void deleteProduct(Integer productID)
    {
        log.info("Product Deleted Successfully");
      productRepository.deleteById(productID);

    }
}
