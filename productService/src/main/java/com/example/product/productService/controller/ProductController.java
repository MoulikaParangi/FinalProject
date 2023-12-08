package com.example.product.productService.controller;


import com.example.product.productService.model.Product;
import com.example.product.productService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/Products")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/add")
    public Product addProduct(@RequestBody  Product product)
    {
        return productService.addProduct(product);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @DeleteMapping("/delete{productID}")
    public void deleteProduct(@PathVariable Integer productID)
    {
         productService.deleteProduct(productID);
    }

}
