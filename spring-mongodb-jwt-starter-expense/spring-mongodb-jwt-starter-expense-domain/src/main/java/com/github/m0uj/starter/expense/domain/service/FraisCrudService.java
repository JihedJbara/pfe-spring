package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.DOC_FRAIS;
/**
 * Created by Jihed-pc on 02/04/2018.
 */
public interface FraisCrudService {

    public DOC_FRAIS create(DOC_FRAIS frais);

    public DOC_FRAIS read(String id);

  //  public void saveFrais (DOC_FRAIS frais);
}
