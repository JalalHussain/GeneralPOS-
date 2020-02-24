package com.general.inventory.rest.controller;
import com.general.base.rest.controller.BaseController;
import com.general.base.rest.service.BaseService;
import com.general.inventory.rest.service.InventoryTransactionDetailService;
import com.general.inventory.rest.service.InventoryTransactionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *<pre>
 *     Rest controller for operations related to InventoryTransactionDetail.
 *</pre>
 * @author jalal
 */
@RestController
@RequestMapping("/inventorytransactiondetail")
public class InventoryTransactionDetailController extends BaseController {

    public InventoryTransactionDetailController(InventoryTransactionDetailService inventoryTransactionDetailService) {
        super(inventoryTransactionDetailService);
    }
}
