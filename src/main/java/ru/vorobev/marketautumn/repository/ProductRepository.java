package ru.vorobev.marketautumn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vorobev.marketautumn.dto.Product;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
