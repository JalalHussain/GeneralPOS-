package com.general.inventory.rest.service;
import com.general.base.data.repo.contract.IBaseRepository;
import com.general.base.rest.service.BaseService;
import com.general.inventory.data.entity.Category;
import com.general.inventory.data.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *<pre>
 *     Rest service for operations related to Category.
 *</pre>
 * @author jalal
 */

@Service
public class CategoryService extends BaseService<Category,String> {

    @Autowired
    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        super(categoryRepository);
    }

}

