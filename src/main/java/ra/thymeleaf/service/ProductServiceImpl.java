package ra.thymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.thymeleaf.model.dto.ProductAddDto;
import ra.thymeleaf.model.entity.Product;
import ra.thymeleaf.model.mapper.ProductMapper;
import ra.thymeleaf.repository.IProductRepo;

import java.util.Collections;
import java.util.Date;
import java.util.List;
@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    private IProductRepo productRepo;
    @Override
    public List<Product> findAll() {
        return productRepo.findAll();
    }

    @Override
    public boolean add(ProductAddDto request) {
        // biến đổi tư dto -> entity
        Product entity = ProductMapper.mapDtoToEntity(request);
        entity.setCreatedAt(new Date());
        entity.setStatus(true);
        return productRepo.save(entity);
    }
}
