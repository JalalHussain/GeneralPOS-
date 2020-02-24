package com.general.inventory.data.entity;

import com.general.base.data.entity.Auditable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 *<pre>
 *     Entity class for database table.
 *</pre>
 * @author jalal
 */

@Entity
@Table(name = "GPOS_TR_INT_TRANSACTION")
public class InventoryTransaction extends Auditable {

    private String id;
    private Date dateTime;
    private String description;
   // private Collection<InventoryTransactionDetail> inventoryTransactionDetails;

    @Id
    @NotNull
    @Column(name = "TR_TRA_ID", length = 10, unique = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "TR_TRA_DATETIME")
    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Column(name="TR_TRA_DESC", length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getPrimaryKeyColumns() {
        return String.join("~~","TR_TRA_ID");
    }

    @Override
    public String getPrimaryKeyValues() {
        return String.join("~~",this.getId());
    }

    @Override
    public String getNonPrimaryKeyColumns() {
        return String.join("~~","TR_TRA_DATETIME","TR_TRA_DESC");
    }

    @Override
    public String getNonPrimaryKeyValues() {
        return String.join("~~",String.valueOf(this.getDateTime()),this.getDescription());
    }

  /*  @JsonIgnore
    @OneToMany(mappedBy="inventoryTransaction")
    public Collection<InventoryTransactionDetail> getInventoryTransactionDetails() {
        return inventoryTransactionDetails;
    }

    public void setInventoryTransactionDetails(Collection<InventoryTransactionDetail> inventoryTransactionDetails) {
        this.inventoryTransactionDetails = inventoryTransactionDetails;
    }*/
}

