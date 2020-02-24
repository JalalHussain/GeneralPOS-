package com.general.base.data.repo.contract;

import com.general.base.data.entity.Auditable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * <pre>
 *     A contract for all repositories.
 * </pre>
 *
 * @author jalal
 */
@NoRepositoryBean
public interface IBaseRepository<T extends Auditable, ID extends Serializable> extends JpaRepository<T,ID>, CrudRepository<T,ID> {

}
