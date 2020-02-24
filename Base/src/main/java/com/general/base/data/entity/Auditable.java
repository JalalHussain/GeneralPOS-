package com.general.base.data.entity;

import com.general.base.audit.EntityAuditListener;
import com.general.base.data.entity.contract.IAuditable;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * <pre>
 *     A base class for all entities.
 * </pre>
 *
 * @author jalal
 */

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class, EntityAuditListener.class})
public abstract class Auditable implements IAuditable {

    private String createdBy;
    private String modifiedBy;
    private Date createDate;
    private Date modifiedDate;

    @CreatedBy
    @Column(name = "CREATED_BY", length = 50)
    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @LastModifiedBy
    @Column(name = "MODIFIED_BY", length = 50)
    @Override
    public String getModifiedBy() {
        return modifiedBy;
    }


    @Override
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @CreatedDate
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @Override
    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Version
    @LastModifiedDate
    @Column(name = "MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @Override
    public Date getModifiedDate() {
        return modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


}
