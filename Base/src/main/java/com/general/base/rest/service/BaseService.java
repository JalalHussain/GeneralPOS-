package com.general.base.rest.service;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.base.rest.service.contract.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.MappedSuperclass;
import java.util.List;
import java.util.Optional;

/**
 * <pre>
 *     A base class for all services.
 * </pre>
 * @author jalal
 */
@MappedSuperclass
public abstract class BaseService<T,ID> implements IBaseService<T,ID> {

    IBaseRepository baseRepository;
    public BaseService(IBaseRepository baseRepository){
        this.baseRepository=baseRepository;
    }
    @Override
    public List<T> getAll() {
        return baseRepository.findAll();
    }

    @Override
    public  Object save(T entity) {
         return baseRepository.save(entity);
    }

    @Override
    public Object update(T entity) {
       return baseRepository.save(entity);
    }

    @Override
    public Optional<T> getById(ID id) {
        return baseRepository.findById(id);
    }

    @Override
    public void delete(T entity) {
         baseRepository.delete(entity);
    }

    @Override
    public boolean deleteById(ID id) {
        return deleteById(id);
    }
}
