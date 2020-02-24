package com.general.inventory.rest.service;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.inventory.data.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceTest extends BaseServiceTest{

    @Autowired
    ProductRepository productRepository;
    public ProductServiceTest(ProductRepository productRepository) {
        super(productRepository);
    }
}
