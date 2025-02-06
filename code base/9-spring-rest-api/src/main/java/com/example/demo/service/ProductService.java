package com.example.demo.service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.example.entity.Product;
@Component
public class ProductService {
List<Product> products=new ArrayList<>();
{
	products.add(new Product(101, "Pen", 50, LocalDate.of(2025, 2, 1)));
	products.add(new Product(102, "Pencil", 5, LocalDate.of(2024, 2, 1)));
	products.add(new Product(103, "Laptop", 50000, LocalDate.of(2024, 12, 10)));
	products.add(new Product(104, "Dark Chocolate", 100, LocalDate.of(2025, 2, 4)));
	products.add(new Product(105, "Necklace", 500000, LocalDate.of(2024, 2, 1)));
}
public List<Product> allProducts(){
	return products;
}
}
