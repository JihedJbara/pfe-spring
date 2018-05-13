package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.REMP_VALID;
import com.github.m0uj.starter.expense.storage.pojo.UserPK4;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
public interface RempValCrudService {
    public REMP_VALID create(REMP_VALID remp_valid);

    public REMP_VALID read(UserPK4 id);

    //public void saveEmplFrais (EMPL_FRAIS empl_frais);

}
