package ru.vorobev.marketautumn.repository;

import org.springframework.stereotype.Repository;
import ru.vorobev.marketautumn.dto.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Apple", 15),
                new Product(2L, "Orange", 19),
                new Product(3L, "Avocado", 30),
                new Product(4L, "Milk", 10),
                new Product(5L, "Bread", 5),
                new Product(6L, "Coffee", 50)
        ));
    }

    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId()==id).findFirst().orElseThrow();
    }

    public List<Product> getAllProducts(){
        return products;
    }

}
