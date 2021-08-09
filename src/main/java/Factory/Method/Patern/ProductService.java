package Factory.Method.Patern;

import Template.Method.Patern.FileGenerator;

public class ProductService extends AbstractService<Product> {

    private DAO<Product> dao;

    public ProductService(FileGenerator fileGenerator) {
        super(fileGenerator);
    }

    @Override
    public DAO<Product> getDao() {
        if (dao == null) {
            dao = new ProductDAO();
        }
        return dao;
    }

    public double getProductByPrice(Object productId) {
        Product product = dao.findById(productId);
        return product.getSalePrice();
    }
}
