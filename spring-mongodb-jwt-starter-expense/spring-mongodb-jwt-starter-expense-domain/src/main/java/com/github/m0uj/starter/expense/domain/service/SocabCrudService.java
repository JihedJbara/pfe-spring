package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.SOCAB;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
public interface SocabCrudService {
    public SOCAB create(SOCAB socab);

    public SOCAB read(int id);

    //public void saveEmplFrais (EMPL_FRAIS empl_frais);
}
