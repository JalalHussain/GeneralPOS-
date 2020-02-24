package com.general.inventory.data.repo;

import com.general.base.data.repo.contract.IBaseRepository;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.inventory.data.entity.InventoryTransaction;
import org.springframework.stereotype.Repository;

/**
 *<pre>
 *     Repository interface for InventoryTransaction.
 *</pre>
 * @author jalal
 */

@Repository
public interface InventoryTransactionRepository extends IBaseRepository <InventoryTransaction,String>{
}

