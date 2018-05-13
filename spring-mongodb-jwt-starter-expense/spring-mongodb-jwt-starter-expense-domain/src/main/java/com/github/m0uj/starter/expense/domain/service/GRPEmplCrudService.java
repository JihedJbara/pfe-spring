package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.GRP_EMPL_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.UserPK2;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
public interface GRPEmplCrudService {
    public GRP_EMPL_FRAIS create(GRP_EMPL_FRAIS grp_empl_frais);

    public GRP_EMPL_FRAIS read(UserPK2 id);

    //public void saveEmplFrais (EMPL_FRAIS empl_frais);

}
