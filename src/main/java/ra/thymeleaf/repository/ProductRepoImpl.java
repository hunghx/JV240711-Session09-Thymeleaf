package ra.thymeleaf.repository;

import org.springframework.stereotype.Repository;
import ra.thymeleaf.model.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepoImpl implements IProductRepo{
    @PersistenceContext
    private EntityManager manager;
    @Override
    public List<Product> findAll() {
        return manager.createQuery("from Product", Product.class).getResultList();
    }

    @Override
    @Transactional
    public boolean save(Product product) {
        try{
            manager.persist(product);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
