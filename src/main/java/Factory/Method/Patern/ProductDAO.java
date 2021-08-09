package Factory.Method.Patern;

import java.util.List;

public class ProductDAO implements DAO<Product> {

    @Override
    public Product findById(Object id) {
        return null;
    }

    @Override
    public void save(Product entity) {

    }

    @Override
    public void delete(Object id) {

    }

    @Override
    public List<Product> findAll() {
        return null;
    }
}
