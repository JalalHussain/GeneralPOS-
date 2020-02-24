package com.general.base.rest.service.contract;

import java.util.List;
import java.util.Optional;

/**
 * <pre>
 *     A contract for all services.
 * </pre>
 * @author jalal
 */
public interface IBaseService<T,ID> {

    List<T> getAll();

    Object save(T entity);

    Object update(T entity);

    Optional<T> getById(ID id);

    void delete(T entity);

    boolean deleteById(ID id);
}
