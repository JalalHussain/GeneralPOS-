package com.general.inventory.rest.service;
import com.general.base.data.repo.contract.IBaseRepository;
import com.general.base.rest.service.BaseService;

import com.general.inventory.data.entity.Supplier;
import com.general.inventory.data.repo.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *<pre>
 *     Rest service for operations related to Supplier.
 *</pre>
 * @author jalal
 */

@Service
public class SupplierService extends BaseService<Supplier,String>{
    @Autowired
    SupplierRepository supplierRepository;
    public SupplierService(SupplierRepository supplierRepository) {
        super(supplierRepository);
    }
}
