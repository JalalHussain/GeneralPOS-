package com.general.inventory.rest.controller;

import com.general.base.rest.controller.BaseController;
import com.general.base.rest.service.BaseService;
import com.general.inventory.data.entity.Category;
import com.general.inventory.rest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *<pre>
 *     Rest controller for operations related to Category.
 *</pre>
 * @author jalal
 */
@RestController
@RequestMapping("/category")
public class CategoryController extends BaseController<Category,String>{

    @Autowired
    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        super(categoryService);
    }

}
