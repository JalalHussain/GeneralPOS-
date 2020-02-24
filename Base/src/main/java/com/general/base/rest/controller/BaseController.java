package com.general.base.rest.controller;

import com.general.base.rest.controller.contract.IBaseController;
import com.general.base.rest.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.MappedSuperclass;
import java.util.List;
import java.util.Optional;

/**
 * <pre>
 *     A base class for all controllers.
 * </pre>
 * @author jalal
 */
@MappedSuperclass
public abstract class BaseController<T,ID> implements IBaseController<T,ID>{

    BaseService baseService;

    public BaseController(BaseService baseService){
        this.baseService=baseService;
    }

    @GetMapping(path = "/all",produces = "application/json")
    @Override
    public List<T> getAll() {
    return baseService.getAll();
    }

    @PostMapping(path = "/save",produces = "application/json",consumes = "application/json")
    @Override
    public Object save(@RequestBody T entity) {
        return baseService.save(entity);
    }

    @PostMapping(path = "/update",produces = "application/json",consumes = "application/json")
    @Override
    public Object update(@RequestBody T entity) {
        return baseService.update(entity);
    }

    @GetMapping(path = "/get/{id}",produces = "application/json")
    @Override
    public Optional<T> getById(@PathVariable ID id) {
        return baseService.getById(id);
    }

    @PostMapping(path = "/delete",produces = "application/json",consumes = "application/json")
    @Override
    public void delete(@RequestBody T entity) {
        baseService.delete(entity);
    }

    @GetMapping(path = "/delete/{id}",produces = "application/json",consumes = "application/json")
    @Override
    public boolean deleteById(@PathVariable ID id) {
        return baseService.deleteById(id);
    }

}
