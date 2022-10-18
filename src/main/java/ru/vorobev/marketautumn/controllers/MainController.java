package ru.vorobev.marketautumn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vorobev.marketautumn.dto.Product;
import ru.vorobev.marketautumn.service.ProductService;

import java.util.List;

@RestController

public class MainController {

    @Autowired
    private ProductService service;

    @GetMapping("/get/{id}")
    public Product getProduct(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/products")
    public List<Product> getAllProduct() {
        return service.findAll();
    }

    @GetMapping("/add")
    public Product getAllProduct(@RequestParam String title, @RequestParam int cost) {
        return service.addNewProduct(title,cost);

    }

    @GetMapping("/delete/{id}")
    public void getAllProduct(@PathVariable Long id) {
        service.deleteById(id);
    }
}
