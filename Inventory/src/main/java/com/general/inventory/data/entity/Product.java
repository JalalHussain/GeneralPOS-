package com.general.inventory.data.entity;

import com.general.base.data.entity.Auditable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 *<pre>
 *     Entity class for database table.
 *</pre>
 * @author jalal
 */

@Entity
@Table(name = "GPOS_PR_PRODUCT")
public class Product extends Auditable {

    private String id;
    private String name;
    private String description;
    private String address;
    private Category category;

    @Id
    @NotNull
    @Column(name = "PR_PRO_ID", length = 10, unique = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "PR_PRO_NAME", length = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "PR_PR_DESC", length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "SP_SUP_ADDRESS", length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ManyToOne (fetch = FetchType.EAGER, optional = true)
    @JoinColumn(name = "CT_CAT_ID", nullable = true)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String getPrimaryKeyColumns() {
        return String.join("~~","PR_PRO_ID");
    }

    @Override
    public String getPrimaryKeyValues() {
        return String.join("~~",this.getId());
    }

    @Override
    public String getNonPrimaryKeyColumns() {
        return String.join("~~","PR_PRO_NAME","PR_PR_DESC","SP_SUP_ADDRESS");
    }

    @Override
    public String getNonPrimaryKeyValues() {
        return String.join("~~",this.getName(), this.getDescription(), this.getAddress());
    }
}

