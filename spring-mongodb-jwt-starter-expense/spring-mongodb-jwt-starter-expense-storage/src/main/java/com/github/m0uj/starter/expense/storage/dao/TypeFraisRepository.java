package com.github.m0uj.starter.expense.storage.dao;

import com.github.m0uj.starter.expense.storage.pojo.TYPE_FRAIS;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Jihed-pc on 12/05/2018.
 */
@Transactional
public interface TypeFraisRepository extends CrudRepository<TYPE_FRAIS,Character> {
    public TYPE_FRAIS findByCTypeDepense(char cTypeDepense);

}
