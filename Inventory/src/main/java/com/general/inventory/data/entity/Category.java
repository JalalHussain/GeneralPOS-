package com.general.inventory.data.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.general.base.data.entity.Auditable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;


/**
 *<pre>
 *     Entity class for database table.
 *</pre>
 * @author jalal
 */

@Entity
@Table(name = "GPOS_CT_CATEGORY")
public class Category extends Auditable {

    private String id;
    private String name;
    private String description;
    private Category parent;
    private Collection<Product> products;

    @Id
    @NotNull
    @Column(name = "CT_CAT_ID", length = 10, unique = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "CT_CAT_NAME", length = 70)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "CT_CAT_DESC", length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "CT_CAT_ID", nullable = true)
    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    @OneToMany(mappedBy="category")
    public Collection<Product> getProducts() {
        return products;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
