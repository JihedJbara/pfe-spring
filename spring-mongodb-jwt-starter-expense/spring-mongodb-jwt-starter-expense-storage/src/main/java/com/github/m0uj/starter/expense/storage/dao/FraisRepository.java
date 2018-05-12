package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.DOC_FRAIS;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Jihed-pc on 02/04/2018.
 */
@Transactional
public interface FraisRepository  extends CrudRepository<DOC_FRAIS, Long> {

    public DOC_FRAIS findById(String id);
}
