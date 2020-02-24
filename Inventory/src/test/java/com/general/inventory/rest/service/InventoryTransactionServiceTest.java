package com.general.inventory.rest.service;

import com.general.inventory.data.repo.InventoryTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class InventoryTransactionServiceTest extends BaseServiceTest{

    @Autowired
    InventoryTransactionRepository inventoryTransactionRepository;

    public InventoryTransactionServiceTest(InventoryTransactionRepository inventoryTransactionRepository) {
        super(inventoryTransactionRepository);
    }
}
