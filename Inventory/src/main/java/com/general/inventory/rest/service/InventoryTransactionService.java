package com.general.inventory.rest.service;//package com.general.inventory.rest.service;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.base.rest.service.BaseService;
import com.general.inventory.data.entity.InventoryTransaction;
import com.general.inventory.data.repo.InventoryTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *<pre>
 *     Rest service for operations related to InventoryTransaction.
 *</pre>
 * @author jalal
 */
@Service
public class InventoryTransactionService extends BaseService<InventoryTransaction,String>{

    @Autowired
    InventoryTransactionRepository  inventoryTransactionRepository;
    public InventoryTransactionService(InventoryTransactionRepository  inventoryTransactionRepository) {
        super(inventoryTransactionRepository);
    }
}
