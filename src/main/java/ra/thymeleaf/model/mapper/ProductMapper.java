package ra.thymeleaf.model.mapper;

import ra.thymeleaf.model.dto.ProductAddDto;
import ra.thymeleaf.model.entity.Product;

public class ProductMapper {
    public static Product mapDtoToEntity(ProductAddDto dto){
        Product product = new Product();
        product.setName(dto.getName());
        product.setStock(dto.getStock());
        product.setUrl(dto.getUrl());
        product.setPrice(dto.getPrice());
        return product;
    }
}
