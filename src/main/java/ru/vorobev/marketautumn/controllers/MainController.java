package ru.vorobev.marketautumn.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.vorobev.marketautumn.service.ProductService;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final ProductService service;

    @GetMapping("/get")
    public String getProduct(Model model, @RequestParam Long id){
        model.addAttribute("productFront", service.getProduct(id));
        return "index.html";
    }

    @GetMapping("/getall")
    public String getAllProduct(Model model){
        model.addAttribute("productList", service.getAllProducts());
        return "product.html";
    }
}
