package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.F_ROUTE;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
public interface FRouteCrudService {

    public F_ROUTE create(F_ROUTE f_route);

    public F_ROUTE read(int id);

    //public void saveEmplFrais (EMPL_FRAIS empl_frais);
}