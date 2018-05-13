package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.TYPE_DEPENSE;

/**
 * Created by Jihed-pc on 13/05/2018.
 */
public interface TYPEDepenseCrudService {

    public TYPE_DEPENSE create(TYPE_DEPENSE type_depense);

    public TYPE_DEPENSE read(char id);

    //public void saveEmplFrais (EMPL_FRAIS empl_frais);
}
