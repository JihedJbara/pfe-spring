package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.PLAF_DEPENSE;
import com.github.m0uj.starter.expense.storage.pojo.UserPK3;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
public interface PLAFDepenseCrudService {
    public PLAF_DEPENSE create(PLAF_DEPENSE plaf_depense);

    public PLAF_DEPENSE read(UserPK3 id);

    //public void saveEmplFrais (EMPL_FRAIS empl_frais);
}
