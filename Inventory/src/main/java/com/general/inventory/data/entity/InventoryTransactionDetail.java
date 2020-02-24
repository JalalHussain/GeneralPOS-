package com.general.inventory.data.entity;//package com.general.inventory.data.entity;

import com.general.base.data.entity.Auditable;

        import javax.persistence.*;
        import javax.validation.constraints.NotNull;
        import com.general.inventory.data.entity.key.InventoryTransactionDetailPK;

/**
 *<pre>
 *     Entity class for database table.
 *</pre>
 * @author jalal
 */
@Entity
@IdClass(InventoryTransactionDetailPK.class)
@Table(name = "GPOS_TR_INT_TRANSACTION_DTL")
public class InventoryTransactionDetail extends Auditable {

    private  String id;
    private  String inventoryTransactionId;
    private  String productId;
    //private  InventoryTransaction inventoryTransaction;
    //private  Product product;
    private  Integer quantity;
    private  Float unitSalePrivce;
    private  Float unitPurchasePrice;
    private  String description;


    @Id
    @NotNull
    @Column(name = "TR_TRA_DTL_ID", length = 10, unique = true, insertable=false, updatable=false)
    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    @Column(name = "TR_TRA_DTL_QTY")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name = "TR_TRA_DTL_USP")
    public Float getUnitSalePrivce() {
        return unitSalePrivce;
    }

    public void setUnitSalePrivce(Float unitSalePrivce) {
        this.unitSalePrivce = unitSalePrivce;
    }

    @Column(name = "TR_TRA_DTL_UPP")
    public Float getUnitPurchasePrice() {
        return unitPurchasePrice;
    }

    public void setUnitPurchasePrice(Float unitPurchasePrice) {
        this.unitPurchasePrice = unitPurchasePrice;
    }

    @Column(name = "TR_TRA_DTL_DESC", length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TR_TRA_ID", insertable = false, updatable = false)
    public InventoryTransaction getInventoryTransaction() {
        return inventoryTransaction;
    }

    public void setInventoryTransaction(InventoryTransaction inventoryTransaction) {
        this.inventoryTransaction = inventoryTransaction;
    }

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PR_PRO_ID", insertable = false, updatable = false)
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
*/


    @Override
    public String getPrimaryKeyColumns() {
        return String.join("~~","TR_TRA_DTL_ID","TR_TRA_ID","PR_PRO_ID");
    }

    @Override
    public String getPrimaryKeyValues() {
        return String.join("~~",this.getId(), this.getInventoryTransactionId(),this.getProductId());
    }

    @Override
    public String getNonPrimaryKeyColumns() {
        return String.join("~~","TR_TRA_DTL_QTY","TR_TRA_DTL_USP","TR_TRA_DTL_UPP","TR_TRA_DTL_DESC");
    }

    @Override
    public String getNonPrimaryKeyValues() {
        return String.join("~~",String.valueOf(this.getQuantity()),String.valueOf(this.getUnitSalePrivce()),
                String.valueOf(this.getUnitPurchasePrice()), String.valueOf(this.getDescription()));
    }
}
