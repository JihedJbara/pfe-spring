package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.EMPL_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.UserPK;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
public interface EMPLFraisCrudService {


    public EMPL_FRAIS create(EMPL_FRAIS empl_frais);

    public EMPL_FRAIS read(UserPK id);

    //public void saveEmplFrais (EMPL_FRAIS empl_frais);
}
