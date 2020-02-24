package com.general.inventory.rest.controller;

import com.general.base.rest.controller.BaseController;
import com.general.base.rest.service.BaseService;
import com.general.inventory.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *<pre>
 *     Rest controller for operations related to ProductController.
 *</pre>
 * @author jalal
 */

@RestController
@RequestMapping("/product")
public class ProductController extends BaseController {
    @Autowired
    ProductService productService;
    public ProductController(ProductService productService) {
        super(productService);
    }
}
