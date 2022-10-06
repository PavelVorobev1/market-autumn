package ru.vorobev.marketautumn.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vorobev.marketautumn.dto.Product;
import ru.vorobev.marketautumn.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    @Autowired
    private ProductService service;

    @GetMapping("/get")
    public String getProduct(Model model, @RequestParam Long id) {
        model.addAttribute("productFront", service.getProduct(id));
        return "index.html";
    }

    @GetMapping("/get/all")
    public List<Product> getAllProduct() {
        return service.getAllProducts();
    }
}
