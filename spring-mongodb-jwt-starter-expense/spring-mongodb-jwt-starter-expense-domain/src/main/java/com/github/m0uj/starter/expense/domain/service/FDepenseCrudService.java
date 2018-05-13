package com.github.m0uj.starter.expense.domain.service;

import com.github.m0uj.starter.expense.storage.pojo.F_DEPENSE;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
public interface FDepenseCrudService {

    public F_DEPENSE create(F_DEPENSE f_depense);

    public F_DEPENSE read(int id);

    //  public void saveFrais (DOC_FRAIS frais);
}
