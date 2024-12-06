package ra.thymeleaf.service;

import ra.thymeleaf.model.dto.ProductAddDto;
import ra.thymeleaf.model.entity.Product;

import java.util.List;

public interface IProductService {
    // các logic xử lí chuc năng
    List<Product> findAll();
    boolean add(ProductAddDto request);
}
