package Factory.Method.Patern;

import java.util.List;

public interface DAO<E> {
    E findById(Object id);

    void save(E entity);

    void delete(Object id);

    List<E> findAll();
}
