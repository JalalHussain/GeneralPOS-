package com.general.base.rest.controller.contract;

import java.util.List;
import java.util.Optional;

/**
 * <pre>
 *     A contract for all controllers.
 * </pre>
 * @author jalal
 */
public interface IBaseController<T,ID> {

    List<T> getAll();

    Object save(T entity);

    Object update(T entity);

    Optional<T> getById(ID id);

    void delete(T entity);

    boolean deleteById(ID id);
}
