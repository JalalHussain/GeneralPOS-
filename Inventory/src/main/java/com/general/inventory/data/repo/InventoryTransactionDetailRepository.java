package com.general.inventory.data.repo;
import com.general.base.data.repo.contract.IBaseRepository;
import com.general.inventory.data.entity.InventoryTransactionDetail;
import com.general.inventory.data.entity.key.InventoryTransactionDetailPK;
import org.springframework.stereotype.Repository;

/**
 *<pre>
 *     Repository interface for InventoryTransactionDetail.
 *</pre>
 * @author jalal
 */
@Repository
public interface InventoryTransactionDetailRepository extends IBaseRepository<InventoryTransactionDetail,InventoryTransactionDetailPK> {
}
