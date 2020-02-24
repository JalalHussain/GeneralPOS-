package com.general.inventory.data.repo;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.inventory.data.entity.Supplier;
import org.springframework.stereotype.Repository;

/**
 *<pre>
 *     Repository interface for Supplier.
 *</pre>
 * @author jalal
 */

@Repository
public interface SupplierRepository extends IBaseRepository<Supplier,String>{
}

