package com.general.inventory.rest.service;

import com.general.base.rest.service.BaseService;
import com.general.inventory.data.entity.Product;
import com.general.inventory.data.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *<pre>
 *     Rest service for operations related to Product.
 *</pre>
 * @author jalal
 */

@Service
public class ProductService extends BaseService<Product,String>{
    @Autowired
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        super(productRepository);
    }
}
