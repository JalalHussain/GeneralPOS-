package com.general.base.data.entity.contract;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 *     A contract for all entities.
 * </pre>
 * @author jalal
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public interface IAuditable<U> {

      String getCreatedBy();

      void setCreatedBy(String createdBy);

      String getModifiedBy();

      void setModifiedBy(String modifiedBy);

      Date getCreateDate();

      void setCreateDate(Date createDate);

      Date getModifiedDate();

      void setModifiedDate(Date modifiedDate);

      String getPrimaryKeyColumns();

      String getPrimaryKeyValues();

      String getNonPrimaryKeyColumns();

      String getNonPrimaryKeyValues();

}
