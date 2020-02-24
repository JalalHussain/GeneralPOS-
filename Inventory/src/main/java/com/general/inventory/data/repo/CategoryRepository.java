package com.general.inventory.data.repo;

import com.general.base.data.repo.contract.IBaseRepository;
import com.general.inventory.data.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 *<pre>
 *     Repository interface for Category.
 *</pre>
 * @author jalal
 */

@Repository
public interface CategoryRepository extends IBaseRepository<Category,String>{
}

