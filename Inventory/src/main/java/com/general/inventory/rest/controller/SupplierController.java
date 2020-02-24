package com.general.inventory.rest.controller;

import com.general.base.rest.controller.BaseController;

import com.general.base.rest.controller.BaseController;
import com.general.base.rest.service.BaseService;
import com.general.inventory.rest.service.SupplierService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *<pre>
 *     Rest controller for operations related to Supplier.
 *</pre>
 * @author jalal
 */

@RestController
@RequestMapping("/supplier")
public class SupplierController extends BaseController {
    public SupplierController(SupplierService supplierService) {
        super(supplierService);
    }
}

