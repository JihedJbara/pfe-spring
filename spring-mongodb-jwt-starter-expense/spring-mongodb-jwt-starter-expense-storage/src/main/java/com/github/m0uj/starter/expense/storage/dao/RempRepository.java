package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.REMP_VALID;
import com.github.m0uj.starter.expense.storage.pojo.UserPK4;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Transactional
public interface RempRepository extends CrudRepository<REMP_VALID,UserPK4> {
  public REMP_VALID findByIdAndDate (UserPK4 id);

}
