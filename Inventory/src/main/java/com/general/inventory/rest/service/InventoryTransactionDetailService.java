package com.general.inventory.rest.service;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.inventory.data.entity.InventoryTransactionDetail;
import com.general.inventory.data.entity.key.InventoryTransactionDetailPK;
import com.general.inventory.data.repo.CategoryRepository;
import com.general.inventory.data.repo.InventoryTransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.general.base.rest.service.BaseService;

/**
 *<pre>
 *     Rest service for operations related to InventoryTransactionDetail.
 *</pre>
 * @author jalal
 */

@Service
public class InventoryTransactionDetailService extends BaseService<InventoryTransactionDetail,InventoryTransactionDetailPK> {

    @Autowired
    InventoryTransactionDetailRepository  inventoryTransactionDetailRepository;

    public InventoryTransactionDetailService(InventoryTransactionDetailRepository  inventoryTransactionDetailRepository) {
        super(inventoryTransactionDetailRepository);
    }
}

