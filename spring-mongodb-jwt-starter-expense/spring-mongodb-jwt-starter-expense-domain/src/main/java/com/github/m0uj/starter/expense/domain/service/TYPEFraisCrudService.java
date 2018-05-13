package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.TYPE_FRAIS;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
public interface TYPEFraisCrudService {

    public TYPE_FRAIS create(TYPE_FRAIS type_frais);

    public TYPE_FRAIS read(char id);

    //public void saveEmplFrais (EMPL_FRAIS empl_frais);
}
