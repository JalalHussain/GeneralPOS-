package com.general.base.audit;

import com.general.base.data.entity.Auditable;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.transaction.Transactional;

import static javax.transaction.Transactional.TxType.MANDATORY;

public class EntityAuditListener {

    @PrePersist
    public void prePersist(Auditable auditable){
        perform(auditable, Action.INSERTED);
    }
    @PreUpdate
    public void preUpdate(Auditable auditable){
        perform(auditable, Action.UPDATED);
    }
    @PreRemove
    public void preRemove(Auditable auditable){
        perform(auditable, Action.DELETED);
    }

    @Transactional(MANDATORY)
    public void perform(Auditable auditable, Action action){
       System.out.println("The action "+action+" has been performed on Enity by "+auditable.getCreatedBy());
    }
}
