package com.general.inventory.rest.service;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.inventory.data.repo.InventoryTransactionDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryTransactionDetailServiceTest extends BaseServiceTest {

    @Autowired
    InventoryTransactionDetailRepository inventoryTransactionDetailRepository;

    public InventoryTransactionDetailServiceTest(InventoryTransactionDetailRepository inventoryTransactionDetailRepository) {
        super(inventoryTransactionDetailRepository);
    }
}
