package ru.vorobev.marketautumn.service;


import org.springframework.stereotype.Service;
import ru.vorobev.marketautumn.dto.Product;
import ru.vorobev.marketautumn.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product findById(Long id){
        return productRepository.findById(id).orElseThrow();
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product addNewProduct(String title, int cost){
        return productRepository.saveAndFlush(new Product(title,cost));
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }
}
