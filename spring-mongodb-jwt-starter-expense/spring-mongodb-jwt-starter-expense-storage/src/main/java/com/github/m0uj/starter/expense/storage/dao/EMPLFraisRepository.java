package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.EMPL_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.UserPK;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Transactional
public interface EMPLFraisRepository extends CrudRepository<EMPL_FRAIS , UserPK> {
    public EMPL_FRAIS findByIdAndGrp_empl_frais (UserPK id);

}
