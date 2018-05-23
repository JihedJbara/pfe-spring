package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.DOC_FRAIS;
import com.github.m0uj.starter.expense.storage.pojo.F_DEPENSE;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Transactional
public interface FDepenseRepository extends CrudRepository<F_DEPENSE ,Integer> {
    public F_DEPENSE findByTFDepense(int T_FDEPENSE);


}
