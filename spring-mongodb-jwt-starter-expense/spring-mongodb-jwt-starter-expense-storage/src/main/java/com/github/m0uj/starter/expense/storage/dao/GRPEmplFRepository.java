package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.DOC_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.GRP_EMPL_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.UserPK2;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Transactional
public interface GRPEmplFRepository extends CrudRepository<GRP_EMPL_FRAIS,UserPK2> {
    public GRP_EMPL_FRAIS findByIdAndGRP(int T_SOCAB , char C_GRP_EMPL_FRAIS);

}
