package ru.vorobev.marketautumn.service;


import lombok.RequiredArgsConstructor;
import ru.vorobev.marketautumn.dto.Product;
import ru.vorobev.marketautumn.repository.ProductRepository;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product getProduct(long id){
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts(){
        return productRepository.getAllProducts();
    }
}
