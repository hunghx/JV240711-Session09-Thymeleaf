package ra.thymeleaf.repository;

import ra.thymeleaf.model.entity.Product;

import java.util.List;

public interface IProductRepo {
    // Các chức năng cu chương trình dùng dể lấy du liêu
    List<Product> findAll();
    boolean save(Product product);
}
