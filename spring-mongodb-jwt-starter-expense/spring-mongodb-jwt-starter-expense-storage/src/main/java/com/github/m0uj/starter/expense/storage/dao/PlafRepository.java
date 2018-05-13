package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.EMPL_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.PLAF_DEPENSE;
import com.github.m0uj.starter.expense.storage.pojo.UserPK3;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Transactional
public interface PlafRepository extends CrudRepository<PLAF_DEPENSE,UserPK3> {
    public PLAF_DEPENSE findByIdAndType (UserPK3 id);

}
