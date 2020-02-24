package com.general.inventory.rest.service;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.inventory.data.repo.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class SupplierServiceTest extends BaseServiceTest{

    @Autowired
    SupplierRepository supplierRepository;
    public SupplierServiceTest(SupplierRepository supplierRepository) {
        super(supplierRepository);
    }
}
