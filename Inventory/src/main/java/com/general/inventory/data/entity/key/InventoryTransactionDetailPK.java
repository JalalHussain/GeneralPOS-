package com.general.inventory.data.entity.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class InventoryTransactionDetailPK implements Serializable {

    private  String id;
    private  String inventoryTransactionId;
    private  String productId;

    @Id
    @NotNull
    @Column(name = "TR_TRA_DTL_ID", length = 10)
    public String getId() {
        return id;
    }

    public void setId(String d) {
        this.id = id;
    }

    @Id
    @NotNull
    @Column(name="TR_TRA_ID")
    public String getInventoryTransactionId() {
        return inventoryTransactionId;
    }

    public void setInventoryTransactionId(String inventoryTransactionId) {
        this.inventoryTransactionId = inventoryTransactionId;
    }

    @Id
    @NotNull
    @Column(name= "PR_PRO_ID")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
