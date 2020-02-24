package com.general.inventory.data.repo;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.inventory.data.entity.Product;
import org.springframework.stereotype.Repository;

/**
 *<pre>
 *     Repository interface for Product.
 *</pre>
 * @author jalal
 **/


@Repository
public interface ProductRepository extends IBaseRepository<Product,String> {
}

