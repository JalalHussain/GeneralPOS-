package com.general.inventory.rest.controller;
import com.general.base.rest.controller.BaseController;
import com.general.base.rest.service.BaseService;
import com.general.inventory.rest.service.InventoryTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *<pre>
 *     Rest controller for operations related to InventoryTransaction.
 *</pre>
 * @author jalal
 */

@RestController
@RequestMapping("/inventorytransaction")
public class InventoryTransactionController extends BaseController {

    public InventoryTransactionController(InventoryTransactionService inventoryTransactionService) {
        super(inventoryTransactionService);
    }
}
